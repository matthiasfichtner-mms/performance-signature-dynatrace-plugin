/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
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

package de.tsystems.mms.apm.performancesignature.dynatrace.rest.json.model;

import com.google.gson.annotations.SerializedName;
import de.tsystems.mms.apm.performancesignature.dynatrace.model.BaseReference;
import de.tsystems.mms.apm.performancesignature.util.PerfSigUIUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * AlertReference
 */

public class AlertReference extends BaseReference {
    @SerializedName("rule")
    private String rule;

    /**
     * Incident Rule name
     *
     * @return rule
     **/
    @ApiModelProperty(value = "Incident Rule name")
    public String getRule() {
        return rule;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertReference {\n");

        sb.append("    id: ").append(PerfSigUIUtils.toIndentedString(super.getId())).append("\n");
        sb.append("    href: ").append(PerfSigUIUtils.toIndentedString(super.getHref())).append("\n");
        sb.append("    rule: ").append(PerfSigUIUtils.toIndentedString(rule)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

