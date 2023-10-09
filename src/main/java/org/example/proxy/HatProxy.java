package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HatProxy implements InvocationHandler {

    private Hat delegate;

    public HatProxy(Hat delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        System.out.println("proxy = " + proxy);
        if (method.getName().equals("pullOutName") && delegate.getName() == null) {
            System.out.println("setting name by proxy");
            delegate.setName("name created by proxy");
        }

        Object result = method.invoke(delegate, args);

        System.out.println("proxy invoked");

        return result;
    }
}
