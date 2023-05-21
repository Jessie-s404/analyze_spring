package designpattern.proxy.dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyFactory
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午3:14   @Version 1.0        描述
 */
public class ProxyFactory {

    private ProxyFactory() {
    }

    private static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getInstance() {
        return proxyFactory;
    }

    /**
     * Jdk动态代理
     * @param obj
     * @return
     */
    public Object getJdkProxy(Object obj) {

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;

                        // 写增强逻辑
                        System.out.println("中介（代理）收取服务费3000元");
                        // 调用原有业务逻辑
                        result = method.invoke(obj, args);

                        System.out.println("客户信息卖了3毛钱");

                        return result;
                    }
                });
    }

    /**
     * Cglib动态代理
     * @param obj
     * @return
     */
    public Object getCglibProxy(Object obj) {
        return Enhancer.create(obj.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                System.out.println("中介（代理）收取服务费3000元");
                result = method.invoke(obj, objects);
                System.out.println("客户信息卖了3毛钱");
                return result;
            }
        });
    }
}
