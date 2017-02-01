package com.samsolutions.norka.statistic;

import com.samsolutions.norka.profiler.Traceable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by dznor on 01.02.2017.
 */
public class TraceablePostProcessor implements BeanPostProcessor {

//    private static final Logger LOG = LoggerFactory.getLogger(TraceablePostProcessor.class);

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof Traceable) {
            System.out.println("Inside post process before initialization: " + s);
        }
        int i = 1;
        i++;
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (o instanceof Traceable) {
            System.out.println("Inside post process after initialization: " + s);
        }
        return o;
    }
}
