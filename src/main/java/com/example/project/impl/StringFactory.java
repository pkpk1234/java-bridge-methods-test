package com.example.project.impl;

import com.example.project.Factory;

import java.util.Date;

/**
 * Created by pkpk1234 on 2017/5/30.
 */

/*
public class com.example.project.impl.StringFactory implements com.example.project.Factory<java.lang.String> {
  public com.example.project.impl.StringFactory();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.Object produce();
    Code:
       0: aload_0
       1: invokevirtual #7                  // Method produce:()Ljava/lang/String;
       4: areturn

  public java.lang.String produce();
    Code:
       0: new           #2                  // class java/util/Date
       3: dup
       4: invokespecial #3                  // Method java/util/Date."<init>":()V
       7: invokevirtual #4                  // Method java/util/Date.toString:()Ljava/lang/String;
      10: areturn

  public java.lang.Object process(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #5                  // class java/lang/String
       5: invokevirtual #6                  // Method process:(Ljava/lang/String;)Ljava/lang/String;
       8: areturn

  public java.lang.String process(java.lang.String);
    Code:
       0: aload_1
       1: areturn

  public void doSomething();
    Code:
       0: return
}

 */
public class StringFactory implements Factory<String> {

    @Override
    public String produce() {
        return new Date().toString();
    }

    @Override
    public String process(String in) {
        return in;
    }

    public void doSomething() {

    }
}
