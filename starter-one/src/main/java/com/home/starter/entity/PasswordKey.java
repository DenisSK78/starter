package com.home.starter.entity;

import java.time.Duration;

public class PasswordKey {
    private String passwordKey;
    private Duration durationPeriod;

    public String getPasswordKey() {
        return passwordKey;
    }

    public void setPasswordKey(String passwordKey) {
        this.passwordKey = passwordKey;
    }

    public Duration getDurationPeriod() {
        return durationPeriod;
    }

    public void setDurationPeriod(Duration durationPeriod) {
        this.durationPeriod = durationPeriod;
    }

    @Override
    public String toString() {
        return "PasswordKey{" +
                "passwordKey='" + passwordKey + '\'' +
                ", durationPeriod=" + durationPeriod +
                '}';
    }
}
