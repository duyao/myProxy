package cglibProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CglibProxy proxy = new CglibProxy();
		Train train = (Train) proxy.getProxy(Train.class);
		train.move();
		
	}

}
