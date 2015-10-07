package cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;



public class CglibProxy implements MethodInterceptor{

	private Enhancer enhancer = new Enhancer();
	public Object getProxy(Class myClass){
		//设置创建子类的类
		enhancer.setSuperclass(myClass);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	/* 
	 * Object arg0目标类的实例
	 * Method arg1目标方法的反射对象
	 * Object[] arg2方法的参数
	 * MethodProxy arg3代理类的实例
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始行驶...");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("停止行驶...");
		return null;
	}
	

	

	

}
