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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.tsystems.mms.apm.performancesignature.dynatracesaas.model.TagInfo;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static de.tsystems.mms.apm.performancesignature.ui.util.PerfSigUIUtils.toIndentedString;

/**
 * Host
 */

public class Host {
    @SerializedName("entityId")
    private String entityId;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("customizedName")
    private String customizedName;

    @SerializedName("discoveredName")
    private String discoveredName;

    @SerializedName("firstSeenTimestamp")
    private Long firstSeenTimestamp;

    @SerializedName("lastSeenTimestamp")
    private Long lastSeenTimestamp;

    @SerializedName("tags")
    private List<TagInfo> tags;

    @SerializedName("fromRelationships")
    private HostFromRelationships fromRelationships;

    @SerializedName("toRelationships")
    private HostToRelationships toRelationships;

    @SerializedName("paasMemoryLimit")
    private Long paasMemoryLimit;
    @SerializedName("hypervisorType")
    private HypervisorTypeEnum hypervisorType;
    @SerializedName("paasType")
    private PaasTypeEnum paasType;
    @SerializedName("agentVersion")
    private AgentVersion agentVersion;
    @SerializedName("cloudType")
    private CloudTypeEnum cloudType;
    @SerializedName("osArchitecture")
    private OsArchitectureEnum osArchitecture;
    @SerializedName("osType")
    private OsTypeEnum osType;
    @SerializedName("logicalCpuCores")
    private Integer logicalCpuCores;
    @SerializedName("azureComputeModeName")
    private AzureComputeModeNameEnum azureComputeModeName;
    @SerializedName("ipAddresses")
    private List<String> ipAddresses;
    @SerializedName("bitness")
    private BitnessEnum bitness;
    @SerializedName("cpuCores")
    private Integer cpuCores;
    @SerializedName("isMonitoringCandidate")
    private Boolean isMonitoringCandidate;
    @SerializedName("azureHostNames")
    private List<String> azureHostNames;
    @SerializedName("osVersion")
    private String osVersion;
    @SerializedName("azureSku")
    private AzureSkuEnum azureSku;
    @SerializedName("consumedHostUnits")
    private String consumedHostUnits;
    @SerializedName("azureSiteNames")
    private List<String> azureSiteNames;
    @SerializedName("monitoringMode")
    private MonitoringModeEnum monitoringMode;
    @SerializedName("userLevel")
    private UserLevelEnum userLevel;
    @SerializedName("openstackAvZone")
    private String openstackAvZone;

    public Host entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Dynatrace entity ID of the required entity.   You can find them in the URL of the corresponding Dynatrace page, for example, &#x60;HOST-007&#x60;.
     *
     * @return entityId
     **/
    @ApiModelProperty(value = "Dynatrace entity ID of the required entity.   You can find them in the URL of the corresponding Dynatrace page, for example, `HOST-007`.")
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Host displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The name of the Dynatrace entity, displayed in the UI.
     *
     * @return displayName
     **/
    @ApiModelProperty(value = "The name of the Dynatrace entity, displayed in the UI.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Host customizedName(String customizedName) {
        this.customizedName = customizedName;
        return this;
    }

    /**
     * Customized name of the entity
     *
     * @return customizedName
     **/
    @ApiModelProperty(value = "Customized name of the entity")
    public String getCustomizedName() {
        return customizedName;
    }

    public void setCustomizedName(String customizedName) {
        this.customizedName = customizedName;
    }

    public Host discoveredName(String discoveredName) {
        this.discoveredName = discoveredName;
        return this;
    }

    /**
     * Discovered name of the entity
     *
     * @return discoveredName
     **/
    @ApiModelProperty(value = "Discovered name of the entity")
    public String getDiscoveredName() {
        return discoveredName;
    }

    public void setDiscoveredName(String discoveredName) {
        this.discoveredName = discoveredName;
    }

    public Host firstSeenTimestamp(Long firstSeenTimestamp) {
        this.firstSeenTimestamp = firstSeenTimestamp;
        return this;
    }

    /**
     * Timestamp in UTC milliseconds when the entity was detected for the first time.
     *
     * @return firstSeenTimestamp
     **/
    @ApiModelProperty(value = "Timestamp in UTC milliseconds when the entity was detected for the first time.")
    public Long getFirstSeenTimestamp() {
        return firstSeenTimestamp;
    }

    public void setFirstSeenTimestamp(Long firstSeenTimestamp) {
        this.firstSeenTimestamp = firstSeenTimestamp;
    }

    public Host lastSeenTimestamp(Long lastSeenTimestamp) {
        this.lastSeenTimestamp = lastSeenTimestamp;
        return this;
    }

    /**
     * Timestamp in UTC milliseconds when the entity was detected for the last time.
     *
     * @return lastSeenTimestamp
     **/
    @ApiModelProperty(value = "Timestamp in UTC milliseconds when the entity was detected for the last time.")
    public Long getLastSeenTimestamp() {
        return lastSeenTimestamp;
    }

    public void setLastSeenTimestamp(Long lastSeenTimestamp) {
        this.lastSeenTimestamp = lastSeenTimestamp;
    }

    public Host tags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public Host addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The list of entity tags.
     *
     * @return tags
     **/
    @ApiModelProperty(value = "The list of entity tags.")
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    public Host fromRelationships(HostFromRelationships fromRelationships) {
        this.fromRelationships = fromRelationships;
        return this;
    }

    /**
     * Get fromRelationships
     *
     * @return fromRelationships
     **/
    public HostFromRelationships getFromRelationships() {
        return fromRelationships;
    }

    public void setFromRelationships(HostFromRelationships fromRelationships) {
        this.fromRelationships = fromRelationships;
    }

    public Host toRelationships(HostToRelationships toRelationships) {
        this.toRelationships = toRelationships;
        return this;
    }

    /**
     * Get toRelationships
     *
     * @return toRelationships
     **/
    public HostToRelationships getToRelationships() {
        return toRelationships;
    }

    public void setToRelationships(HostToRelationships toRelationships) {
        this.toRelationships = toRelationships;
    }

    public Host paasMemoryLimit(Long paasMemoryLimit) {
        this.paasMemoryLimit = paasMemoryLimit;
        return this;
    }

    /**
     * @return paasMemoryLimit
     **/
    public Long getPaasMemoryLimit() {
        return paasMemoryLimit;
    }

    public void setPaasMemoryLimit(Long paasMemoryLimit) {
        this.paasMemoryLimit = paasMemoryLimit;
    }

    public Host hypervisorType(HypervisorTypeEnum hypervisorType) {
        this.hypervisorType = hypervisorType;
        return this;
    }

    /**
     * @return hypervisorType
     **/
    public HypervisorTypeEnum getHypervisorType() {
        return hypervisorType;
    }

    public void setHypervisorType(HypervisorTypeEnum hypervisorType) {
        this.hypervisorType = hypervisorType;
    }

    public Host paasType(PaasTypeEnum paasType) {
        this.paasType = paasType;
        return this;
    }

    /**
     * @return paasType
     **/
    public PaasTypeEnum getPaasType() {
        return paasType;
    }

    public void setPaasType(PaasTypeEnum paasType) {
        this.paasType = paasType;
    }

    public Host agentVersion(AgentVersion agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Defines the version of the agent currently running on the entity.
     *
     * @return agentVersion
     **/
    @ApiModelProperty(value = "Defines the version of the agent currently running on the entity.")
    public AgentVersion getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(AgentVersion agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Host cloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * @return cloudType
     **/
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public Host osArchitecture(OsArchitectureEnum osArchitecture) {
        this.osArchitecture = osArchitecture;
        return this;
    }

    /**
     * @return osArchitecture
     **/
    public OsArchitectureEnum getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(OsArchitectureEnum osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public Host osType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * @return osType
     **/
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public Host logicalCpuCores(Integer logicalCpuCores) {
        this.logicalCpuCores = logicalCpuCores;
        return this;
    }

    /**
     * @return logicalCpuCores
     **/
    public Integer getLogicalCpuCores() {
        return logicalCpuCores;
    }

    public void setLogicalCpuCores(Integer logicalCpuCores) {
        this.logicalCpuCores = logicalCpuCores;
    }

    public Host azureComputeModeName(AzureComputeModeNameEnum azureComputeModeName) {
        this.azureComputeModeName = azureComputeModeName;
        return this;
    }

    /**
     * @return azureComputeModeName
     **/
    public AzureComputeModeNameEnum getAzureComputeModeName() {
        return azureComputeModeName;
    }

    public void setAzureComputeModeName(AzureComputeModeNameEnum azureComputeModeName) {
        this.azureComputeModeName = azureComputeModeName;
    }

    public Host ipAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    public Host addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    /**
     * @return ipAddresses
     **/
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public Host bitness(BitnessEnum bitness) {
        this.bitness = bitness;
        return this;
    }

    /**
     * @return bitness
     **/
    public BitnessEnum getBitness() {
        return bitness;
    }

    public void setBitness(BitnessEnum bitness) {
        this.bitness = bitness;
    }

    public Host cpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * @return cpuCores
     **/
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public Host isMonitoringCandidate(Boolean isMonitoringCandidate) {
        this.isMonitoringCandidate = isMonitoringCandidate;
        return this;
    }

    /**
     * @return isMonitoringCandidate
     **/
    public Boolean isIsMonitoringCandidate() {
        return isMonitoringCandidate;
    }

    public void setIsMonitoringCandidate(Boolean isMonitoringCandidate) {
        this.isMonitoringCandidate = isMonitoringCandidate;
    }

    public Host azureHostNames(List<String> azureHostNames) {
        this.azureHostNames = azureHostNames;
        return this;
    }

    public Host addAzureHostNamesItem(String azureHostNamesItem) {
        if (this.azureHostNames == null) {
            this.azureHostNames = new ArrayList<>();
        }
        this.azureHostNames.add(azureHostNamesItem);
        return this;
    }

    /**
     * @return azureHostNames
     **/
    public List<String> getAzureHostNames() {
        return azureHostNames;
    }

    public void setAzureHostNames(List<String> azureHostNames) {
        this.azureHostNames = azureHostNames;
    }

    public Host osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * @return osVersion
     **/
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Host azureSku(AzureSkuEnum azureSku) {
        this.azureSku = azureSku;
        return this;
    }

    /**
     * @return azureSku
     **/
    public AzureSkuEnum getAzureSku() {
        return azureSku;
    }

    public void setAzureSku(AzureSkuEnum azureSku) {
        this.azureSku = azureSku;
    }

    public Host consumedHostUnits(String consumedHostUnits) {
        this.consumedHostUnits = consumedHostUnits;
        return this;
    }

    /**
     * @return consumedHostUnits
     **/
    public String getConsumedHostUnits() {
        return consumedHostUnits;
    }

    public void setConsumedHostUnits(String consumedHostUnits) {
        this.consumedHostUnits = consumedHostUnits;
    }

    public Host azureSiteNames(List<String> azureSiteNames) {
        this.azureSiteNames = azureSiteNames;
        return this;
    }

    public Host addAzureSiteNamesItem(String azureSiteNamesItem) {
        if (this.azureSiteNames == null) {
            this.azureSiteNames = new ArrayList<>();
        }
        this.azureSiteNames.add(azureSiteNamesItem);
        return this;
    }

    /**
     * @return azureSiteNames
     **/
    public List<String> getAzureSiteNames() {
        return azureSiteNames;
    }

    public void setAzureSiteNames(List<String> azureSiteNames) {
        this.azureSiteNames = azureSiteNames;
    }

    public Host monitoringMode(MonitoringModeEnum monitoringMode) {
        this.monitoringMode = monitoringMode;
        return this;
    }

    /**
     * @return monitoringMode
     **/
    public MonitoringModeEnum getMonitoringMode() {
        return monitoringMode;
    }

    public void setMonitoringMode(MonitoringModeEnum monitoringMode) {
        this.monitoringMode = monitoringMode;
    }

    public Host userLevel(UserLevelEnum userLevel) {
        this.userLevel = userLevel;
        return this;
    }

    /**
     * @return userLevel
     **/
    public UserLevelEnum getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(UserLevelEnum userLevel) {
        this.userLevel = userLevel;
    }

    public Host openstackAvZone(String openstackAvZone) {
        this.openstackAvZone = openstackAvZone;
        return this;
    }

    /**
     * @return openstackAvZone
     **/
    public String getOpenstackAvZone() {
        return openstackAvZone;
    }

    public void setOpenstackAvZone(String openstackAvZone) {
        this.openstackAvZone = openstackAvZone;
    }

    @Override
    public String toString() {
        return "class Host {\n"
                + "    entityId: " + toIndentedString(entityId) + "\n"
                + "    displayName: " + toIndentedString(displayName) + "\n"
                + "    customizedName: " + toIndentedString(customizedName) + "\n"
                + "    discoveredName: " + toIndentedString(discoveredName) + "\n"
                + "    firstSeenTimestamp: " + toIndentedString(firstSeenTimestamp) + "\n"
                + "    lastSeenTimestamp: " + toIndentedString(lastSeenTimestamp) + "\n"
                + "    tags: " + toIndentedString(tags) + "\n"
                + "    fromRelationships: " + toIndentedString(fromRelationships) + "\n"
                + "    toRelationships: " + toIndentedString(toRelationships) + "\n"
                + "    paasMemoryLimit: " + toIndentedString(paasMemoryLimit) + "\n"
                + "    hypervisorType: " + toIndentedString(hypervisorType) + "\n"
                + "    paasType: " + toIndentedString(paasType) + "\n"
                + "    agentVersion: " + toIndentedString(agentVersion) + "\n"
                + "    cloudType: " + toIndentedString(cloudType) + "\n"
                + "    osArchitecture: " + toIndentedString(osArchitecture) + "\n"
                + "    osType: " + toIndentedString(osType) + "\n"
                + "    logicalCpuCores: " + toIndentedString(logicalCpuCores) + "\n"
                + "    azureComputeModeName: " + toIndentedString(azureComputeModeName) + "\n"
                + "    ipAddresses: " + toIndentedString(ipAddresses) + "\n"
                + "    bitness: " + toIndentedString(bitness) + "\n"
                + "    cpuCores: " + toIndentedString(cpuCores) + "\n"
                + "    isMonitoringCandidate: " + toIndentedString(isMonitoringCandidate) + "\n"
                + "    azureHostNames: " + toIndentedString(azureHostNames) + "\n"
                + "    osVersion: " + toIndentedString(osVersion) + "\n"
                + "    azureSku: " + toIndentedString(azureSku) + "\n"
                + "    consumedHostUnits: " + toIndentedString(consumedHostUnits) + "\n"
                + "    azureSiteNames: " + toIndentedString(azureSiteNames) + "\n"
                + "    monitoringMode: " + toIndentedString(monitoringMode) + "\n"
                + "    userLevel: " + toIndentedString(userLevel) + "\n"
                + "    openstackAvZone: " + toIndentedString(openstackAvZone) + "\n"
                + "}";
    }

    /**
     *
     */
    @JsonAdapter(HypervisorTypeEnum.Adapter.class)
    public enum HypervisorTypeEnum {
        VMWARE("VMWARE"),
        XEN("XEN"),
        HYPERV("HYPERV"),
        VIRTUALBOX("VIRTUALBOX"),
        KVM("KVM"),
        QEMU("QEMU");

        private final String value;

        HypervisorTypeEnum(String value) {
            this.value = value;
        }

        public static HypervisorTypeEnum fromValue(String text) {
            return Arrays.stream(HypervisorTypeEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<HypervisorTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final HypervisorTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public HypervisorTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return HypervisorTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     *
     */
    @JsonAdapter(PaasTypeEnum.Adapter.class)
    public enum PaasTypeEnum {
        AZURE_WEBSITES("AZURE_WEBSITES"),
        CLOUD_FOUNDRY("CLOUD_FOUNDRY"),
        OPENSHIFT("OPENSHIFT"),
        HEROKU("HEROKU"),
        KUBERNETES("KUBERNETES"),
        GOOGLE_APP_ENGINE("GOOGLE_APP_ENGINE"),
        AWS_LAMBDA("AWS_LAMBDA");

        private final String value;

        PaasTypeEnum(String value) {
            this.value = value;
        }

        public static PaasTypeEnum fromValue(String text) {
            return Arrays.stream(PaasTypeEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<PaasTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PaasTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PaasTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PaasTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     *
     */
    @JsonAdapter(CloudTypeEnum.Adapter.class)
    public enum CloudTypeEnum {
        EC2("EC2"),
        AZURE("AZURE"),
        OPENSTACK("OPENSTACK"),
        ORACLE("ORACLE");

        private final String value;

        CloudTypeEnum(String value) {
            this.value = value;
        }

        public static CloudTypeEnum fromValue(String text) {
            return Arrays.stream(CloudTypeEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<CloudTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CloudTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CloudTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CloudTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     *
     */
    @JsonAdapter(OsArchitectureEnum.Adapter.class)
    public enum OsArchitectureEnum {
        X86("X86"),
        IA64("IA64"),
        PARISC("PARISC"),
        PPC("PPC"),
        SPARC("SPARC"),
        S390("S390"),
        ARM("ARM"),
        PPCLE("PPCLE");

        private final String value;

        OsArchitectureEnum(String value) {
            this.value = value;
        }

        public static OsArchitectureEnum fromValue(String text) {
            return Arrays.stream(OsArchitectureEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<OsArchitectureEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OsArchitectureEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OsArchitectureEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OsArchitectureEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     *
     */
    @JsonAdapter(OsTypeEnum.Adapter.class)
    public enum OsTypeEnum {
        WINDOWS("WINDOWS"),
        LINUX("LINUX"),
        HPUX("HPUX"),
        AIX("AIX"),
        SOLARIS("SOLARIS"),
        ZOS("ZOS"),
        DARWIN("DARWIN");

        private final String value;

        OsTypeEnum(String value) {
            this.value = value;
        }

        public static OsTypeEnum fromValue(String text) {
            return Arrays.stream(OsTypeEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<OsTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OsTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OsTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OsTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     *
     */
    @JsonAdapter(AzureComputeModeNameEnum.Adapter.class)
    public enum AzureComputeModeNameEnum {
        SHARED("SHARED"),
        DEDICATED("DEDICATED");

        private final String value;

        AzureComputeModeNameEnum(String value) {
            this.value = value;
        }

        public static AzureComputeModeNameEnum fromValue(String text) {
            return Arrays.stream(AzureComputeModeNameEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<AzureComputeModeNameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AzureComputeModeNameEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AzureComputeModeNameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AzureComputeModeNameEnum.fromValue(String.valueOf(value));
            }
        }
    }


    /**
     *
     */
    @JsonAdapter(AzureSkuEnum.Adapter.class)
    public enum AzureSkuEnum {
        FREE("FREE"),
        SHARED("SHARED"),
        BASIC("BASIC"),
        STANDARD("STANDARD"),
        PREMIUM("PREMIUM");

        private final String value;

        AzureSkuEnum(String value) {
            this.value = value;
        }

        public static AzureSkuEnum fromValue(String text) {
            return Arrays.stream(AzureSkuEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<AzureSkuEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AzureSkuEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AzureSkuEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AzureSkuEnum.fromValue(String.valueOf(value));
            }
        }
    }


    /**
     *
     */
    @JsonAdapter(MonitoringModeEnum.Adapter.class)
    public enum MonitoringModeEnum {
        OFF("OFF"),
        FULL_STACK("FULL_STACK"),
        INFRASTRUCTURE("INFRASTRUCTURE");

        private final String value;

        MonitoringModeEnum(String value) {
            this.value = value;
        }

        public static MonitoringModeEnum fromValue(String text) {
            return Arrays.stream(MonitoringModeEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<MonitoringModeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MonitoringModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MonitoringModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MonitoringModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     *
     */
    @JsonAdapter(UserLevelEnum.Adapter.class)
    public enum UserLevelEnum {
        SUPERUSER("SUPERUSER"),
        NON_SUPERUSER("NON_SUPERUSER"),
        NON_SUPERUSER_STRICT("NON_SUPERUSER_STRICT");

        private final String value;

        UserLevelEnum(String value) {
            this.value = value;
        }

        public static UserLevelEnum fromValue(String text) {
            return Arrays.stream(UserLevelEnum.values()).filter(b -> String.valueOf(b.value).equals(text)).findFirst().orElse(null);
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<UserLevelEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UserLevelEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UserLevelEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return UserLevelEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

