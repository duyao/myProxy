package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	/**
	 * 测试类
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		InvocationHandler timeHandler = new TimeHandler(car);
		InvocationHandler logHandler = new LogHandler(car);
		Class<?> myClass = car.getClass();
		Moveable timeMoveable = (Moveable)Proxy.newProxyInstance(myClass.getClassLoader(), myClass.getInterfaces(), timeHandler);
		//Moveable logMoveable = (Moveable)Proxy.newProxyInstance(myClass.getClassLoader(), myClass.getInterfaces(), logHandler);
		//logMoveable.move();
		timeMoveable.move();
		 
	}

}
