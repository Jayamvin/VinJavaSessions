package javasessions;

public class CallByRef {
	
	public static void sendMail(CallByRef a) {
		System.out.println("send mail");
		
		a.readMail();
	}

	public void readMail() {
		System.out.println("read mail");
		
	}

	public static void main(String[] args) {
		CallByRef obj1 = new CallByRef();
		obj1.readMail();
		CallByRef.sendMail(obj1);

	}

}
//a.readmail() is different from obj.readmail()