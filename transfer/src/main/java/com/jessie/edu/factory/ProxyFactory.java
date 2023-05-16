package com.jessie.edu.factory;

import com.jessie.edu.utils.TransactionManager;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyFactory
 * Description: 代理对象工厂：生成代理对象的
 * 两种实现动态代理的方法：Jdk动态代理、cglib动态代理
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-15 下午4:35   @Version 1.0        描述
 */
public class ProxyFactory {

    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    /**
     * Jdk动态代理
     * @param obj
     * @return
     */
    public Object getJdkProxy(Object obj) {

        //获取代理对象
        //三个参数：类加载器、动态代理类需要实现的接口、事件处理器
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;

                        try{
                            //开启事务(关闭事务的自动提交)
                            transactionManager.beginTransaction();

                            result = method.invoke(obj,args);

                            //提交事务
                            transactionManager.commit();
                        } catch (Exception e) {
                            e.printStackTrace();
                            //回滚事务
                            transactionManager.rollback();

                            //抛出异常便于上层servlet捕获
                            throw e;
                        }
                        return result;
                    }
                });
    }

    /**
     * 使用cglib动态代理生成代理对象
     * @param obj
     * @return
     */
    public Object getCglibProxy(Object obj) {
        //两个参数：被代理的class文件、Callback接口(MethodInterceptor继承了Callback接口)
        return Enhancer.create(obj.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                try{
                    // 开启事务(关闭事务的自动提交)
                    transactionManager.beginTransaction();

                    result = method.invoke(obj, objects);

                    // 提交事务

                    transactionManager.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    // 回滚事务
                    transactionManager.rollback();

                    // 抛出异常便于上层servlet捕获
                    throw e;
                }
                return result;
            }
        });
    }
}

