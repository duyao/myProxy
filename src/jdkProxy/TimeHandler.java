package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}
	private Object target;
	/* 
	 * proxy 被代理的对象
	 * method 被代理的方法
	 * args 方法参数 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Long startime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		method.invoke(target);
		long endtime = System.currentTimeMillis();
		System.out.println("汽车行驶结束...");
		System.out.println("汽车行驶"+(endtime-startime)+"ms");
		return null;
	}

}
