package com.interceptor.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * 模拟DefaultActionInvocation 
 * 所有的拦截器存放在一个ArrayList中 
 * 该类应当持有拦截器数组的引用和Action的引用
 * </pre>
 */
public class Invocation {

    private List<Interceptor>     interceptors = new ArrayList<Interceptor>();
    private Iterator<Interceptor> it;
    private Action                action;

    public Invocation() {
        interceptors.add(new FirstInterceptor());
        interceptors.add(new SecondInterceptor());
        interceptors.add(new ThirdInterceptor());
        it = interceptors.iterator();
        action = new Action();
    }

    /**
     * <pre>
     * 这是一个递归方法 
     * 方法直接或者间接地调用自身即为递归。
     *  invoke()调用intercept(),intercept()又调用invoke()
     * </pre>
     */
    public void invoke() {

        Interceptor interceptor;
        if (it.hasNext()) {
            // 若链表中仍有Interceptor，则调用下一个Interceptor
            interceptor = it.next();
            interceptor.intercept(this);

        } else {
            action.execute();
        }

    }
}
