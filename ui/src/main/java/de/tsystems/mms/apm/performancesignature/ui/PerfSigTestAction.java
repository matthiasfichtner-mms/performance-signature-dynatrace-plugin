/*
 * Copyright (c) 2014-2018 T-Systems Multimedia Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tsystems.mms.apm.performancesignature.ui;

import de.tsystems.mms.apm.performancesignature.dynatrace.model.PerfSigTestData;
import de.tsystems.mms.apm.performancesignature.dynatrace.model.TestResult;
import de.tsystems.mms.apm.performancesignature.dynatrace.model.TestRun;
import de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils;
import hudson.tasks.junit.CaseResult;
import hudson.tasks.junit.TestAction;
import hudson.tasks.test.TestObject;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

@ExportedBean
public class PerfSigTestAction extends TestAction {
    private final PerfSigTestData testData;
    private final TestObject testObject;
    private TestRun matchingTestRun;
    private TestResult matchingTestResult;

    public PerfSigTestAction(final TestObject testObject, final PerfSigTestData testData) {
        this.testData = testData;
        this.testObject = testObject;

        if (testObject instanceof CaseResult) {
            CaseResult caseResult = (CaseResult) this.testObject;
            String packageName = caseResult.getPackageName();
            String fullName = caseResult.getSimpleName() + "." + caseResult.getSearchName();

            testData.getTestRuns().forEach(testRun -> testRun.getTestResults().stream()
                    .filter(testResult -> testResult.getPackage().equalsIgnoreCase(packageName) && testResult.getName().equalsIgnoreCase(fullName))
                    .forEach(testResult -> {
                        this.matchingTestRun = testRun;
                        this.matchingTestResult = testResult;
                    }));
        }
    }

    public TestResult getPreviousTestResult() {
        hudson.tasks.test.TestResult testResult = testObject.getPreviousResult();
        if (testResult == null) return null;
        PerfSigTestAction testAction = testResult.getTestAction(PerfSigTestAction.class);
        if (testAction != null && testAction.getTestData() != null) {
            return testAction.getTestData().getTestRuns().stream()
                    .flatMap(testRun -> testRun.getTestResults().stream())
                    .filter(result -> result.getPackage().equals(matchingTestResult.getPackage()) && result.getName().equals(matchingTestResult.getName()))
                    .findFirst().orElse(null);
        }
        return null;
    }

    public TestObject getTestObject() {
        return testObject;
    }

    public Class getPerfSigUtils() {
        return PerfSigUIUtils.class;
    }

    public PerfSigTestData getTestData() {
        return testData;
    }

    public TestRun getMatchingTestRun() {
        return matchingTestRun;
    }

    @Exported(name = "testResult")
    public TestResult getMatchingTestResult() {
        return matchingTestResult;
    }

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "";
    }

    @Override
    public String getUrlName() {
        return null;
    }
}
