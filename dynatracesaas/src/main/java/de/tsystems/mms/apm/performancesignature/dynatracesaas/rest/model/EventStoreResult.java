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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * Contains ids of all custom events that were created by an event push call
 */
@ApiModel(description = "Contains ids of all custom events that were created by an event push call")

public class EventStoreResult {
    @SerializedName("storedEventIds")
    private List<String> storedIds;

    public EventStoreResult storedIds(List<String> storedIds) {
        this.storedIds = storedIds;
        return this;
    }

    public EventStoreResult addStoredIdsItem(String storedIdsItem) {
        if (this.storedIds == null) {
            this.storedIds = new ArrayList<>();
        }
        this.storedIds.add(storedIdsItem);
        return this;
    }

    /**
     * Array of event ids, that were created by an event push call
     *
     * @return storedIds
     **/
    @ApiModelProperty(value = "Array of event ids, that were created by an event push call")
    public List<String> getStoredIds() {
        return storedIds;
    }

    public void setStoredIds(List<String> storedIds) {
        this.storedIds = storedIds;
    }

    @Override
    public String toString() {
        return "class EventStoreResult {\n" +
                "    storedIds: " + toIndentedString(Arrays.toString(storedIds.toArray())) + "\n" +
                "}";
    }
}

