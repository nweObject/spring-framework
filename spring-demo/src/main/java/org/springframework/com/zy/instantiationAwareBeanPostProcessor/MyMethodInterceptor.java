package org.springframework.com.zy.instantiationAwareBeanPostProcessor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 标题：MyMethodInterceptor
 * 说明：
 * 时间：2024/12/9 17:12
 *
 * @author zy
 * @version 1.0.0
 */
public class MyMethodInterceptor implements MethodInterceptor {


	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("目标方法执行之前" + method);
		Object o1 = methodProxy.invokeSuper(o, objects);
		System.out.println("目标方法执行之后" + method);
		return o1;
	}
}
