package com.dujie.config;

import com.dujie.advice.GlobalExceptionAdvice;
import com.dujie.properties.ExceptionProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties({ExceptionProperties.class})
public class ExceptionAutoConfiguration {

    @Bean
    @ConditionalOnProperty(value = ExceptionProperties.PREFIX + ".enabled", matchIfMissing = true)
    public GlobalExceptionAdvice globalExceptionHandler() {
        return new GlobalExceptionAdvice();
    }
}
