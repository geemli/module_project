package com.samsolutions.norka.statistic.config;

import com.samsolutions.norka.statistic.TraceablePostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dznor on 01.02.2017.
 */

@Configuration
public class StatisticSpringConfig {

    @Bean(name = "traceablePostProcessor")
    public TraceablePostProcessor getTraceablePostProcessor() {
        return new TraceablePostProcessor();
    }
}
