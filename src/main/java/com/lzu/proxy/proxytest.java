package com.lzu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
interface testInterface {
    void test();
    void test2();
}
class MyClass implements testInterface {
    public void test() {
        System.out.println("MyClass method");
    }
    public void test2() {
        System.out.println("MyClass method2");
    }
}
public class proxytest {
    public static void main(String[] args) {
        MyClass target = new MyClass();
        InvocationHandler handler = (Object proxy, Method method, Object[] args1) -> {
            System.out.println("before invoke " + method.getName());
            Object result = method.invoke(target, args1);
            System.out.println("after invoke " + method.getName());
            return result;
        };
        testInterface myClass = (testInterface) Proxy.newProxyInstance(MyClass.class.getClassLoader(), new Class[]{testInterface.class}, handler);
        myClass.test();
        myClass.test2();
    }
}
