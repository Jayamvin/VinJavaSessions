package packg1;

public class BMW extends Car{

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.test();
	//	b.engine(); cannot call private

	}

}
