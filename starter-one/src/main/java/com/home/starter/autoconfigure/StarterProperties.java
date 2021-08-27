package com.home.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.time.Duration;

@ConfigurationProperties("demo.starter")
public class StarterProperties {

    /**
     * key for password
     */
    private String passwordKey = "KEY";

    @NestedConfigurationProperty
    private DurationPeriod durationPeriod = new DurationPeriod();

    public String getPasswordKey() {
        return passwordKey;
    }

    public void setPasswordKey(String passwordKey) {
        this.passwordKey = passwordKey;
    }

    public DurationPeriod getDurationPeriod() {
        return durationPeriod;
    }

    public void setDurationPeriod(DurationPeriod durationPeriod) {
        this.durationPeriod = durationPeriod;
    }

    public static class DurationPeriod {

        /**
         * key duration time
         */
        private Duration period = Duration.ofMillis(5);

        public Duration getPeriod() {
            return period;
        }

        public void setPeriod(Duration period) {
            this.period = period;
        }
    }

}
