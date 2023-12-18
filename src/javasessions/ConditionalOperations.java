package javasessions;

public class ConditionalOperations {

	public static void main(String[] args) {
		
		
		int a = 20;
		if(a == 10) { //false
			System.out.println("Hi");
		}
		else {
			System.out.println("bye");
		}
		
		int x1 = 100;
		int y1 = 100;
		
		if(x1 == y1) { //true
			System.out.println("testing");
		}
		
		if(true) {
			System.out.println("Hello selenium");
		}
		else {//dead code
			System.out.println("bye selenium");
		}
		
		//--------------------//
		
		boolean flag = true;
		
		if(flag) {
			System.out.println("Hello selenium");
		}
		else {
			System.out.println("bye selenium");
		}
		
		//
		int g = 100;
		int h = 200;
		if( h >= g ) {//true
			System.out.println("h is gr than g");
		}
		else {
			System.out.println("g is gr than h");
		}
		
		//WAP three diff values ---> max value
		
		
		
		int w = 700;
		int x = 500;
		int y = 200;
		int z = 600;
		
		if(w>x && w>y && w>z) {
			System.out.println("w is the greatest");
		}
		else if(x>y && x>z) {
			System.out.println("x is teh greatest");
		}
		else if(y>z) {
			System.out.println("y is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
	}

}


//ctrl+forward slash for commenting
//syso+trl+space 
// ctrl+shift+O - for importing necessary packages
//ctrl+shift+f -- formating 
//switch+trl+space choose switch control statement 
//increments/decrements directly apply on variables only