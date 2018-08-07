package de.tsystems.mms.apm.performancesignature.dynatracesaas.rest.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Arrays;

/**
 * The type of the event.
 */
@JsonAdapter(EventTypeEnum.Adapter.class)
public enum EventTypeEnum {
    APPLICATION_JS_FRAMEWORK_DETECTED("APPLICATION_JS_FRAMEWORK_DETECTED"),
    AVAILABILITY_EVENT("AVAILABILITY_EVENT"),
    CONNECTION_LOST("CONNECTION_LOST"),
    CPU_SATURATED("CPU_SATURATED"),
    CUSTOM_ALERT("CUSTOM_ALERT"),
    CUSTOM_ANNOTATION("CUSTOM_ANNOTATION"),
    CUSTOM_CONFIGURATION("CUSTOM_CONFIGURATION"),
    CUSTOM_DEPLOYMENT("CUSTOM_DEPLOYMENT"),
    CUSTOM_INFO("CUSTOM_INFO"),
    DATABASE_CONNECTION_FAILURE("DATABASE_CONNECTION_FAILURE"),
    DOCKER_MEMORY_SATURATION("DOCKER_MEMORY_SATURATION"),
    EBS_VOLUME_HIGH_LATENCY("EBS_VOLUME_HIGH_LATENCY"),
    ELASTIC_LOAD_BALANCER_HIGH_BACKEND_FAILURE_RATE("ELASTIC_LOAD_BALANCER_HIGH_BACKEND_FAILURE_RATE"),
    ELASTIC_LOAD_BALANCER_HIGH_FAILURE_RATE("ELASTIC_LOAD_BALANCER_HIGH_FAILURE_RATE"),
    ELASTIC_LOAD_BALANCER_HIGH_UNHEALTHY_HOST_RATE("ELASTIC_LOAD_BALANCER_HIGH_UNHEALTHY_HOST_RATE"),
    ERROR_EVENT("ERROR_EVENT"),
    ESXI_START("ESXI_START"),
    FAILURE_RATE_INCREASED("FAILURE_RATE_INCREASED"),
    HIGH_CONNECTIVITY_FAILURES("HIGH_CONNECTIVITY_FAILURES"),
    HIGH_DROPPED_PACKETS_RATE("HIGH_DROPPED_PACKETS_RATE"),
    HIGH_GC_ACTIVITY("HIGH_GC_ACTIVITY"),
    HIGH_LATENCY("HIGH_LATENCY"),
    HIGH_NETWORK_ERROR_RATE("HIGH_NETWORK_ERROR_RATE"),
    HIGH_NETWORK_LOSS_RATE("HIGH_NETWORK_LOSS_RATE"),
    HIGH_NETWORK_UTILIZATION("HIGH_NETWORK_UTILIZATION"),
    HOST_CONNECTION_FAILED("HOST_CONNECTION_FAILED"),
    HOST_CONNECTION_LOST("HOST_CONNECTION_LOST"),
    HOST_DATASTORE_LOW_DISK_SPACE("HOST_DATASTORE_LOW_DISK_SPACE"),
    HOST_DISK_LOW_INODES("HOST_DISK_LOW_INODES"),
    HOST_GRACEFULLY_SHUTDOWN("HOST_GRACEFULLY_SHUTDOWN"),
    HOST_LOG_AVAILABILITY("HOST_LOG_AVAILABILITY"),
    HOST_LOG_ERROR("HOST_LOG_ERROR"),
    HOST_LOG_MATCHED("HOST_LOG_MATCHED"),
    HOST_LOG_PERFORMANCE("HOST_LOG_PERFORMANCE"),
    HOST_MAINTENANCE("HOST_MAINTENANCE"),
    HOST_NO_CONNECTION("HOST_NO_CONNECTION"),
    HOST_OF_SERVICE_UNAVAILABLE("HOST_OF_SERVICE_UNAVAILABLE"),
    HOST_SHUTDOWN("HOST_SHUTDOWN"),
    HOST_TIMEOUT("HOST_TIMEOUT"),
    INSUFFICIENT_DISK_QUEUE_DEPTH("INSUFFICIENT_DISK_QUEUE_DEPTH"),
    JAVASCRIPT_ERROR_RATE_INCREASED("JAVASCRIPT_ERROR_RATE_INCREASED"),
    LAMBDA_FUNCTION_HIGH_ERROR_RATE("LAMBDA_FUNCTION_HIGH_ERROR_RATE"),
    LOG_AVAILABILITY("LOG_AVAILABILITY"),
    LOG_ERROR("LOG_ERROR"),
    LOG_MATCHED("LOG_MATCHED"),
    LOG_PERFORMANCE("LOG_PERFORMANCE"),
    LOW_DISK_SPACE("LOW_DISK_SPACE"),
    LOW_STORAGE_SPACE("LOW_STORAGE_SPACE"),
    MEMORY_RESOURCES_EXHAUSTED("MEMORY_RESOURCES_EXHAUSTED"),
    MEMORY_SATURATED("MEMORY_SATURATED"),
    MOBILE_APP_CRASH_RATE_INCREASED("MOBILE_APP_CRASH_RATE_INCREASED"),
    MONITORING_UNAVAILABLE("MONITORING_UNAVAILABLE"),
    OPENSTACK_KEYSTONE_SLOW("OPENSTACK_KEYSTONE_SLOW"),
    OPENSTACK_KEYSTONE_UNHEALTHY("OPENSTACK_KEYSTONE_UNHEALTHY"),
    OSI_DOCKER_DEVICEMAPPER_LOW_DATA_SPACE("OSI_DOCKER_DEVICEMAPPER_LOW_DATA_SPACE"),
    OSI_DOCKER_DEVICEMAPPER_LOW_METADATA_SPACE("OSI_DOCKER_DEVICEMAPPER_LOW_METADATA_SPACE"),
    OVERLOADED_STORAGE("OVERLOADED_STORAGE"),
    PERFORMANCE_EVENT("PERFORMANCE_EVENT"),
    PGI_HAPROXY_QUEUED_REQUESTS_HIGH("PGI_HAPROXY_QUEUED_REQUESTS_HIGH"),
    PGI_HAPROXY_SESSION_USAGE_HIGH("PGI_HAPROXY_SESSION_USAGE_HIGH"),
    PGI_MYSQL_SLOW_QUERIES_RATE_HIGH("PGI_MYSQL_SLOW_QUERIES_RATE_HIGH"),
    PGI_OF_SERVICE_UNAVAILABLE("PGI_OF_SERVICE_UNAVAILABLE"),
    PGI_RMQ_HIGH_FILE_DESC_USAGE("PGI_RMQ_HIGH_FILE_DESC_USAGE"),
    PGI_RMQ_HIGH_MEM_USAGE("PGI_RMQ_HIGH_MEM_USAGE"),
    PGI_RMQ_HIGH_PROCESS_USAGE("PGI_RMQ_HIGH_PROCESS_USAGE"),
    PGI_RMQ_HIGH_SOCKETS_USAGE("PGI_RMQ_HIGH_SOCKETS_USAGE"),
    PGI_RMQ_LOW_DISK_SPACE("PGI_RMQ_LOW_DISK_SPACE"),
    PROCESS_CRASHED("PROCESS_CRASHED"),
    PROCESS_CUSTOM_AVAILABILITY("PROCESS_CUSTOM_AVAILABILITY"),
    PROCESS_CUSTOM_ERROR("PROCESS_CUSTOM_ERROR"),
    PROCESS_CUSTOM_PERFORMANCE("PROCESS_CUSTOM_PERFORMANCE"),
    PROCESS_GROUP_LOW_INSTANCE_COUNT("PROCESS_GROUP_LOW_INSTANCE_COUNT"),
    PROCESS_LOG_AVAILABILITY("PROCESS_LOG_AVAILABILITY"),
    PROCESS_LOG_ERROR("PROCESS_LOG_ERROR"),
    PROCESS_LOG_PERFORMANCE("PROCESS_LOG_PERFORMANCE"),
    PROCESS_UNAVAILABLE("PROCESS_UNAVAILABLE"),
    RDS_OF_SERVICE_UNAVAILABLE("RDS_OF_SERVICE_UNAVAILABLE"),
    RDS_RESTART_SEQUENCE("RDS_RESTART_SEQUENCE"),
    RESOURCE_CONTENTION("RESOURCE_CONTENTION"),
    SERVICE_RESPONSE_TIME_DEGRADED("SERVICE_RESPONSE_TIME_DEGRADED"),
    SLOW_DISK("SLOW_DISK"),
    SYNTHETIC_AVAILABILITY("SYNTHETIC_AVAILABILITY"),
    SYNTHETIC_SLOWDOWN("SYNTHETIC_SLOWDOWN"),
    THREADS_RESOURCES_EXHAUSTED("THREADS_RESOURCES_EXHAUSTED"),
    UNEXPECTED_HIGH_LOAD("UNEXPECTED_HIGH_LOAD"),
    UNEXPECTED_LOW_LOAD("UNEXPECTED_LOW_LOAD"),
    USER_ACTION_DURATION_DEGRADATION("USER_ACTION_DURATION_DEGRADATION"),
    VIRTUAL_MACHINE_SHUTDOWN("VIRTUAL_MACHINE_SHUTDOWN"),
    WEB_CHECK_GLOBAL_OUTAGE("WEB_CHECK_GLOBAL_OUTAGE"),
    WEB_CHECK_LOCAL_OUTAGE("WEB_CHECK_LOCAL_OUTAGE");

    private String value;

    EventTypeEnum(String value) {
        this.value = value;
    }

    public static EventTypeEnum fromValue(String text) {
        return Arrays.stream(EventTypeEnum.values()).filter(b -> b.value.equals(text)).findFirst().orElse(null);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EventTypeEnum.fromValue(value);
        }
    }
}
