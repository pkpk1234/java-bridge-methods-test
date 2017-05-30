package com.example.project;

import com.example.project.impl.StringFactory;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by pkpk1234 on 2017/5/31.
 */
public class StringFactoryTest {
    @Test
    public void getBridgeMethod() {
        Class<StringFactory> clazz = StringFactory.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isBridge()) {
                System.out.println(method.getName());
            }
            if(method.isSynthetic()) {
                System.out.println(method.getName());
            }
        }
    }
}
