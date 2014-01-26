package com.interceptor.test;

// 所有拦截器都应该实现该接口或者继承自Interceptor的子类
public interface Interceptor {

    // 这是拦截器类的最重要的方法
    // invocation用于存储拦截器链表
    public void intercept(Invocation invocation);
}
