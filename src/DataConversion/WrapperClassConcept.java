package DataConversion;

public class WrapperClassConcept {
	
//Integer, Double, Float, Boolean are wrapper classes but String is not a wrapper class 

	public static void main(String[] args) {
		
		String x ="100";
		System.out.println(x+20);
		
		//String to int --> Integer:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
		//String to double --> Double:
		String y ="12.33";
		System.out.println(y+20);
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean:
		String remoteExecution ="true";
		boolean flag = Boolean.parseBoolean(remoteExecution);
		if(flag) {
			System.out.println("run tcs on AWS cloud");
		}
		else {
			System.out.println("run tcs on local");
		}
		
		//int to string
		int age = 30;
		String ageVal = String.valueOf(age);//"30"
		System.out.println(ageVal+20);
		
		double sal = 12.33;
		String salValue = String.valueOf(sal);//"12.33"
		System.out.println(salValue.length());
		
		//String to int --> Integer:
		String a ="100A";
		int b = Integer.parseInt(a);//100
		System.out.println(b+20);// numberFormatException
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
	
	}

}
