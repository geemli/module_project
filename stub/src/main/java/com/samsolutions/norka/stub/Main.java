package com.samsolutions.norka.stub;

import com.samsolutions.norka.profiler.Traceable;
import com.samsolutions.norka.profiler.config.ProfilerCoreSpringConfig;
import com.samsolutions.norka.statistic.config.StatisticSpringConfig;
import com.samsolutions.norka.stub.config.TraceableStubSpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dznor on 01.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ProfilerCoreSpringConfig.class);
        context.register(StatisticSpringConfig.class);
        context.register(TraceableStubSpringConfig.class);
        context.refresh();

        Traceable obj = (TraceableImplStub) context.getBean("traceableImplStub");

//        Statistic statistic = (Statistic) context.getBean("statistic");

        obj.calculateBusinessValue();
        obj.calculateBusinessValue();
        obj.calculateBusinessValue();
        obj.calculateBusinessValue();
        obj.doBusinessLogic(1);
        obj.doBusinessLogic(2);
        obj.doBusinessLogic(3);
    }
}
