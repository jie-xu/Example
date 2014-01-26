package com.interceptor.test;

// 第三个拦截器
public class ThirdInterceptor implements Interceptor {

    @Override
    public void intercept(Invocation invocation) {
        System.out.println("Third interceptor -->be called");
        invocation.invoke();
        System.out.println("Third interceptor -->return");
    }
}
