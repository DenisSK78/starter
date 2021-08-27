package com.home.starter.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.home.starter")
@ConditionalOnProperty(value = "demo.starter.enabled", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(StarterProperties.class)
public class StarterAutoConfiguration {
}
