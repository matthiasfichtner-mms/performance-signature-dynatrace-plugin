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
import de.tsystems.mms.apm.performancesignature.util.PerfSigUIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * SystemProfileConfigurations
 */

public class SystemProfileConfigurations {
    @SerializedName("configurations")
    private List<SystemProfileConfiguration> configurations;

    public SystemProfileConfigurations configurations(List<SystemProfileConfiguration> configurations) {
        this.configurations = configurations;
        return this;
    }

    public SystemProfileConfigurations addConfigurationsItem(SystemProfileConfiguration configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    /**
     * Get configurations
     *
     * @return configurations
     **/

    public List<SystemProfileConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<SystemProfileConfiguration> configurations) {
        this.configurations = configurations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemProfileConfigurations {\n");

        sb.append("    configurations: ").append(PerfSigUIUtils.toIndentedString(configurations)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
