package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler{
	public LogHandler(Object target) {
		super();
		this.target = target;
	}


	private Object target;
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("日志开始记录...");
		method.invoke(target);
		System.out.println("日志停止记录...");
		return null;
	}

}
