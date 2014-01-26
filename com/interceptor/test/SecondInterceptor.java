package com.interceptor.test;

// 第二个拦截器
public class SecondInterceptor implements Interceptor {

    public void intercept(Invocation invocation) {
        System.out.println("Second interceptor -->be called");
        invocation.invoke();
        System.out.println("Second interceptor -->return");
    }

}
