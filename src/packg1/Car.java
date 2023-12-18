package packg1;

public class Car {
	
	public String name;
	private int price;
	protected int modelNumber;
	String color;
	

	
	public void start() {
		System.out.println("public -- Method");
	}
	
	protected void stop() {
		System.out.println("protected ---- Method");	
	}
	
	private void engine() {
		System.out.println("private --- Method");
	}
	
	
	void test() {
		System.out.println("Default -- Method");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.engine();
		c.test();

	}

}
