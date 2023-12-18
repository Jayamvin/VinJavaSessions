package OOP_Inheritance;

public class BMW extends Car {
	
	//Method Overriding: Poly(many) + Morphism(forms): RunTime(Dynamic/Late binding)
	//when we have parent and child class:
	//1. with the same method name
	//2. with the same number of parameters/with the same sequence
	//3. with the same return type
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
	
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

}
