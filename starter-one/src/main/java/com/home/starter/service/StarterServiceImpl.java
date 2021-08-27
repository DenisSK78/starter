package com.home.starter.service;

import com.home.starter.StarterService;
import com.home.starter.entity.PasswordKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class StarterServiceImpl implements StarterService {

    private static final Logger log = LoggerFactory.getLogger(StarterServiceImpl.class);

    private final String passwordKey;
    private final Duration durationPeriod;

    public StarterServiceImpl(@Value("${demo.starter.password.key:KEY}") String passwordKey,
                              @Value("${demo.starter.duration.period:5m}") Duration durationPeriod) {
        this.passwordKey = passwordKey;
        this.durationPeriod = durationPeriod;
        log.info("Default parameter password-key is installed: 'password.key' - {}, 'duration.period' - {}",
                passwordKey, durationPeriod);
    }

    public PasswordKey getCurrentPass(){
        PasswordKey passwordKey = new PasswordKey();
        passwordKey.setPasswordKey(this.passwordKey);
        passwordKey.setDurationPeriod(durationPeriod);
        return passwordKey;
    }

}
