package com.interceptor.test;

// 第一个拦截器
public class FirstInterceptor implements Interceptor {

    public void intercept(Invocation invocation) {
        // 向控制输出信息，来模拟action调用前的处理工作
        System.out.println("first interceptor -->be called");
        // 回调DefaultAcctionInvocation的方法
        invocation.invoke();
        // 模拟action调用后的处理工作
        System.out.println("first interceptor -->return");
    }

}
