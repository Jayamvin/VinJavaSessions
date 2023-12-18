package ExceptionHandling;

public class AppException extends RuntimeException {
 // RuntimeException is the parent class of all exceptions but it is child of exception and throwable and then object -- see the screen shot 
	
		// below is the constructor of the class and giving one String parameter
		public AppException(String mesg) {
		//	We are calling the parent constructor and passing the message whatever we like 
					super(mesg);
		
	}

}
