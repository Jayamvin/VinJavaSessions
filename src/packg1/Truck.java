package packg1;

public class Truck {

	public static void main(String[] args) {
		
	  Car c = new Car();
	    c.start();
		c.stop();
		c.test();
	//	c.engine();// cannot call private
		
		Truck t = new Truck();
//		t.start();
//		t.stop();
//		t.test();
//		t.engine();
//		Nothing is allowed in Truck class 
		
	
	}

}
