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
import de.tsystems.mms.apm.performancesignature.dynatracesaas.model.TagMatchRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * Defines which monitored entities a event is to be attached to
 */
@ApiModel(description = "Defines which monitored entities a event is to be attached to")

public class PushEventAttachRules {
    @SerializedName("entityIds")
    private List<String> entityIds;

    @SerializedName("tagRule")
    private List<TagMatchRule> tagRule;

    public PushEventAttachRules entityIds(List<String> entityIds) {
        this.entityIds = entityIds;
        return this;
    }

    public PushEventAttachRules addEntityIdsItem(String entityIdsItem) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        this.entityIds.add(entityIdsItem);
        return this;
    }

    /**
     * Array of entity identifiers, the event should be attached to. This can also just be a single value.
     *
     * @return entityIds
     **/
    @ApiModelProperty(value = "Array of entity identifiers, the event should be attached to. This can also just be a single value.")
    public List<String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
    }

    public PushEventAttachRules tagRule(List<TagMatchRule> tagRule) {
        this.tagRule = tagRule;
        return this;
    }

    public PushEventAttachRules addTagRuleItem(TagMatchRule tagRuleItem) {
        if (this.tagRule == null) {
            this.tagRule = new ArrayList<>();
        }
        this.tagRule.add(tagRuleItem);
        return this;
    }

    /**
     * Array of tagRules which attach the event on all components that match the specific rules. This can also just be a single value.
     *
     * @return tagRule
     **/
    @ApiModelProperty(value = "Array of tagRules which attach the event on all components that match the specific rules. This can also just be a single value.")
    public List<TagMatchRule> getTagRule() {
        return tagRule;
    }

    public void setTagRule(List<TagMatchRule> tagRule) {
        this.tagRule = tagRule;
    }

    @Override
    public String toString() {
        return "class PushEventAttachRules {\n" +
                "    entityIds: " + toIndentedString(entityIds) + "\n" +
                "    tagRule: " + toIndentedString(tagRule) + "\n" +
                "}";
    }
}

