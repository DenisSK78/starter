package com.home.starter.service;

import com.home.starter.StarterService;
import com.home.starter.autoconfigure.StarterProperties;
import com.home.starter.entity.PasswordKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class StarterServiceImpl implements StarterService {

    private static final Logger log = LoggerFactory.getLogger(StarterServiceImpl.class);

    private final String passwordKey;
    private final Duration durationPeriod;

    public StarterServiceImpl(StarterProperties properties) {
        this.passwordKey = properties.getPasswordKey();
        this.durationPeriod = properties.getDurationPeriod().getPeriod();
        log.info("Parameter password-key is installed: 'password-key' - {}, 'duration-period' - {}",
                passwordKey, durationPeriod);
    }

    public PasswordKey getCurrentPass(){
        PasswordKey passwordKey = new PasswordKey();
        passwordKey.setPasswordKey(this.passwordKey);
        passwordKey.setDurationPeriod(this.durationPeriod);
        return passwordKey;
    }

}
