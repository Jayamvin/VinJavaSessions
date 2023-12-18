package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//overridden
		b.Breaks();//inherited
		b.Accelerator();//inherited
		b.Battery();//inherited
		
		
		System.out.println("-------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		
		
	}
		
		
	}


