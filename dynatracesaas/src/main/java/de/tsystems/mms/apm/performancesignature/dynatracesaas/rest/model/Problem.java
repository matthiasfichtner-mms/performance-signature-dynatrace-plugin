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
import de.tsystems.mms.apm.performancesignature.dynatracesaas.model.TagInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * The properties of a problem.
 */
@ApiModel(description = "The properties of a problem.")

public class Problem {
    @SerializedName("id")
    private String id;

    @SerializedName("startTime")
    private Long startTime;

    @SerializedName("endTime")
    private Long endTime;

    @SerializedName("displayName")
    private String displayName;
    @SerializedName("impactLevel")
    private ImpactLevelEnum impactLevel;
    @SerializedName("status")
    private StatusEnum status;
    @SerializedName("severityLevel")
    private SeverityLevelEnum severityLevel;
    @SerializedName("commentCount")
    private Integer commentCount;
    @SerializedName("tagsOfAffectedEntities")
    private List<TagInfo> tagsOfAffectedEntities;
    @SerializedName("rankedEvents")
    private List<Event> rankedEvents;
    @SerializedName("rankedImpacts")
    private List<EventRestImpact> rankedImpacts;
    @SerializedName("affectedCounts")
    private ProblemAffectedCounts affectedCounts;
    @SerializedName("recoveredCounts")
    private ProblemRecoveredCounts recoveredCounts;
    @SerializedName("hasRootCause")
    private Boolean hasRootCause;

    public Problem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the problem.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID of the problem.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Problem startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Timestamp of the problem start, in UTC milliseconds.
     *
     * @return startTime
     **/
    @ApiModelProperty(value = "Timestamp of the problem start, in UTC milliseconds.")
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Problem endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Timestamp of the problem end, in UTC milliseconds. &#x60;-1&#x60; if the problem is still open.
     *
     * @return endTime
     **/
    @ApiModelProperty(value = "Timestamp of the problem end, in UTC milliseconds. `-1` if the problem is still open.")
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Problem displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The name of the problem, displayed in the UI.
     *
     * @return displayName
     **/
    @ApiModelProperty(value = "The name of the problem, displayed in the UI.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Problem impactLevel(ImpactLevelEnum impactLevel) {
        this.impactLevel = impactLevel;
        return this;
    }

    /**
     * The impact level of the problem. It shows what is affected by the problem: infrastructure, service, or application.
     *
     * @return impactLevel
     **/
    @ApiModelProperty(value = "The impact level of the problem. It shows what is affected by the problem: infrastructure, service, or application.")
    public ImpactLevelEnum getImpactLevel() {
        return impactLevel;
    }

    public void setImpactLevel(ImpactLevelEnum impactLevel) {
        this.impactLevel = impactLevel;
    }

    public Problem status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the problem.
     *
     * @return status
     **/
    @ApiModelProperty(value = "The status of the problem.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Problem severityLevel(SeverityLevelEnum severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * The severity of the problem.
     *
     * @return severityLevel
     **/
    @ApiModelProperty(value = "The severity of the problem.")
    public SeverityLevelEnum getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(SeverityLevelEnum severityLevel) {
        this.severityLevel = severityLevel;
    }

    public Problem commentCount(Integer commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    /**
     * Number of comments to the problem.
     *
     * @return commentCount
     **/
    @ApiModelProperty(value = "Number of comments to the problem.")
    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Problem tagsOfAffectedEntities(List<TagInfo> tagsOfAffectedEntities) {
        this.tagsOfAffectedEntities = tagsOfAffectedEntities;
        return this;
    }

    public Problem addTagsOfAffectedEntitiesItem(TagInfo tagsOfAffectedEntitiesItem) {
        if (this.tagsOfAffectedEntities == null) {
            this.tagsOfAffectedEntities = new ArrayList<>();
        }
        this.tagsOfAffectedEntities.add(tagsOfAffectedEntitiesItem);
        return this;
    }

    /**
     * Tags of entities affected by the problem.
     *
     * @return tagsOfAffectedEntities
     **/
    @ApiModelProperty(value = "Tags of entities affected by the problem.")
    public List<TagInfo> getTagsOfAffectedEntities() {
        return tagsOfAffectedEntities;
    }

    public void setTagsOfAffectedEntities(List<TagInfo> tagsOfAffectedEntities) {
        this.tagsOfAffectedEntities = tagsOfAffectedEntities;
    }

    public Problem rankedEvents(List<Event> rankedEvents) {
        this.rankedEvents = rankedEvents;
        return this;
    }

    public Problem addRankedEventsItem(Event rankedEventsItem) {
        if (this.rankedEvents == null) {
            this.rankedEvents = new ArrayList<>();
        }
        this.rankedEvents.add(rankedEventsItem);
        return this;
    }

    /**
     * List of events related to the problem.
     *
     * @return rankedEvents
     **/
    @ApiModelProperty(value = "List of events related to the problem.")
    public List<Event> getRankedEvents() {
        return rankedEvents;
    }

    public void setRankedEvents(List<Event> rankedEvents) {
        this.rankedEvents = rankedEvents;
    }

    public Problem rankedImpacts(List<EventRestImpact> rankedImpacts) {
        this.rankedImpacts = rankedImpacts;
        return this;
    }

    public Problem addRankedImpactsItem(EventRestImpact rankedImpactsItem) {
        if (this.rankedImpacts == null) {
            this.rankedImpacts = new ArrayList<>();
        }
        this.rankedImpacts.add(rankedImpactsItem);
        return this;
    }

    /**
     * Provides impact information of the events in an aggregated form. For a more detailed impact analysis, look at &#39;rankedEvents&#39;
     *
     * @return rankedImpacts
     **/
    @ApiModelProperty(value = "Provides impact information of the events in an aggregated form. For a more detailed impact analysis, look at 'rankedEvents'")
    public List<EventRestImpact> getRankedImpacts() {
        return rankedImpacts;
    }

    public void setRankedImpacts(List<EventRestImpact> rankedImpacts) {
        this.rankedImpacts = rankedImpacts;
    }

    public Problem affectedCounts(ProblemAffectedCounts affectedCounts) {
        this.affectedCounts = affectedCounts;
        return this;
    }

    /**
     * Get affectedCounts
     *
     * @return affectedCounts
     **/
    @ApiModelProperty()
    public ProblemAffectedCounts getAffectedCounts() {
        return affectedCounts;
    }

    public void setAffectedCounts(ProblemAffectedCounts affectedCounts) {
        this.affectedCounts = affectedCounts;
    }

    public Problem recoveredCounts(ProblemRecoveredCounts recoveredCounts) {
        this.recoveredCounts = recoveredCounts;
        return this;
    }

    /**
     * Get recoveredCounts
     *
     * @return recoveredCounts
     **/
    @ApiModelProperty()
    public ProblemRecoveredCounts getRecoveredCounts() {
        return recoveredCounts;
    }

    public void setRecoveredCounts(ProblemRecoveredCounts recoveredCounts) {
        this.recoveredCounts = recoveredCounts;
    }

    public Problem hasRootCause(Boolean hasRootCause) {
        this.hasRootCause = hasRootCause;
        return this;
    }

    /**
     * Whether Dynatrace has found at least one possible root cause for the problem.
     *
     * @return hasRootCause
     **/
    @ApiModelProperty(value = "Whether Dynatrace has found at least one possible root cause for the problem.")
    public Boolean isHasRootCause() {
        return hasRootCause;
    }

    public void setHasRootCause(Boolean hasRootCause) {
        this.hasRootCause = hasRootCause;
    }

    @Override
    public String toString() {
        return "class Problem {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    startTime: " + toIndentedString(startTime) + "\n" +
                "    endTime: " + toIndentedString(endTime) + "\n" +
                "    displayName: " + toIndentedString(displayName) + "\n" +
                "    impactLevel: " + toIndentedString(impactLevel) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "    severityLevel: " + toIndentedString(severityLevel) + "\n" +
                "    commentCount: " + toIndentedString(commentCount) + "\n" +
                "    tagsOfAffectedEntities: " + toIndentedString(tagsOfAffectedEntities) + "\n" +
                "    rankedEvents: " + toIndentedString(rankedEvents) + "\n" +
                "    rankedImpacts: " + toIndentedString(rankedImpacts) + "\n" +
                "    affectedCounts: " + toIndentedString(affectedCounts) + "\n" +
                "    recoveredCounts: " + toIndentedString(recoveredCounts) + "\n" +
                "    hasRootCause: " + toIndentedString(hasRootCause) + "\n" +
                "}";
    }
}

