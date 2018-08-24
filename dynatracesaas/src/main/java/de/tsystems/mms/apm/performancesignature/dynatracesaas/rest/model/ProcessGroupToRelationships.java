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

/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace REST API. Refer to the [help page](https://www.dynatrace.com/support/help/shortlink/section-api) to read about use-cases and examples.
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * ProcessGroupToRelationships
 */

public class ProcessGroupToRelationships {
    @SerializedName("isNetworkClientOfProcessGroup")
    private List<String> isNetworkClientOfProcessGroup;

    @SerializedName("isInstanceOf")
    private List<String> isInstanceOf;

    @SerializedName("runsOn")
    private List<String> runsOn;

    public ProcessGroupToRelationships isNetworkClientOfProcessGroup(List<String> isNetworkClientOfProcessGroup) {
        this.isNetworkClientOfProcessGroup = isNetworkClientOfProcessGroup;
        return this;
    }

    public ProcessGroupToRelationships addIsNetworkClientOfProcessGroupItem(String isNetworkClientOfProcessGroupItem) {
        if (this.isNetworkClientOfProcessGroup == null) {
            this.isNetworkClientOfProcessGroup = new ArrayList<>();
        }
        this.isNetworkClientOfProcessGroup.add(isNetworkClientOfProcessGroupItem);
        return this;
    }

    /**
     * @return isNetworkClientOfProcessGroup
     **/
    public List<String> getIsNetworkClientOfProcessGroup() {
        return isNetworkClientOfProcessGroup;
    }

    public void setIsNetworkClientOfProcessGroup(List<String> isNetworkClientOfProcessGroup) {
        this.isNetworkClientOfProcessGroup = isNetworkClientOfProcessGroup;
    }

    public ProcessGroupToRelationships isInstanceOf(List<String> isInstanceOf) {
        this.isInstanceOf = isInstanceOf;
        return this;
    }

    public ProcessGroupToRelationships addIsInstanceOfItem(String isInstanceOfItem) {
        if (this.isInstanceOf == null) {
            this.isInstanceOf = new ArrayList<>();
        }
        this.isInstanceOf.add(isInstanceOfItem);
        return this;
    }

    /**
     * @return isInstanceOf
     **/
    public List<String> getIsInstanceOf() {
        return isInstanceOf;
    }

    public void setIsInstanceOf(List<String> isInstanceOf) {
        this.isInstanceOf = isInstanceOf;
    }

    public ProcessGroupToRelationships runsOn(List<String> runsOn) {
        this.runsOn = runsOn;
        return this;
    }

    public ProcessGroupToRelationships addRunsOnItem(String runsOnItem) {
        if (this.runsOn == null) {
            this.runsOn = new ArrayList<>();
        }
        this.runsOn.add(runsOnItem);
        return this;
    }

    /**
     * @return runsOn
     **/
    public List<String> getRunsOn() {
        return runsOn;
    }

    public void setRunsOn(List<String> runsOn) {
        this.runsOn = runsOn;
    }

    @Override
    public String toString() {
        return "class ProcessGroupToRelationships {\n"
                + "    isNetworkClientOfProcessGroup: " + toIndentedString(isNetworkClientOfProcessGroup) + "\n"
                + "    isInstanceOf: " + toIndentedString(isInstanceOf) + "\n"
                + "    runsOn: " + toIndentedString(runsOn) + "\n"
                + "}";
    }
}

