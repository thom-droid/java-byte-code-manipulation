package org.example;

import org.example.proxy.Hat;
import org.example.proxy.HatInterface;
import org.example.proxy.HatProxy;

import java.lang.reflect.Proxy;

public class ProxyApp {

    public static void main(String[] args) {

        Hat hat = new Hat();
        HatProxy hatProxy = new HatProxy(hat);

        HatInterface hatInterface = (HatInterface) Proxy.newProxyInstance(
                hat.getClass().getClassLoader()
                , new Class[]{HatInterface.class}
                , hatProxy
        );

        hatInterface.pullOutName();

    }
}
