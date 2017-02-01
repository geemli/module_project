package com.samsolutions.norka.stub.config;

import com.samsolutions.norka.profiler.Traceable;
import com.samsolutions.norka.stub.TraceableImplStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dznor on 01.02.2017.
 */

@Configuration
public class TraceableStubSpringConfig {

    @Bean(name = "traceableImplStub")
    public Traceable getTraceableImplStub() {
        return new TraceableImplStub();
    }
}
