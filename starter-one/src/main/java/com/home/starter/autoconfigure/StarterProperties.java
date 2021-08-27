//package com.home.starter.autoconfigure;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.NestedConfigurationProperty;
//
//import java.time.Duration;
//
//@ConfigurationProperties("demo.starter")
//public class StarterProperties {
//
//    /**
//     * key for password
//     */
//    private String passwordKey = "KEY";
//
//    @NestedConfigurationProperty
//    private DurationProp durationProp = new DurationProp();
//
//    public String getPasswordKey() {
//        return passwordKey;
//    }
//
//    public void setPasswordKey(String passwordKey) {
//        this.passwordKey = passwordKey;
//    }
//
//    public DurationProp getDurationProp() {
//        return durationProp;
//    }
//
//    public void setDurationProp(DurationProp durationProp) {
//        this.durationProp = durationProp;
//    }
//
//    public static class DurationProp {
//
//        /**
//         * key duration time
//         */
//        private Duration period = Duration.ofMillis(5);
//
//        public Duration getPeriod() {
//            return period;
//        }
//
//        public void setPeriod(Duration period) {
//            this.period = period;
//        }
//    }
//
//}
