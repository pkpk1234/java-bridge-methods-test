package com.example.project;

/**
 * Created by pkpk1234 on 2017/5/30.
 */
public interface Factory<T> {
    T produce();
    T process(T in);
}
