package com.samsolutions.norka.profiler;

/**
 * Created by dznor on 01.02.2017.
 */
public interface Traceable<T> {

    public void doBusinessLogic(T t);

    public T calculateBusinessValue();

}
