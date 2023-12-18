package CollectionsTopics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> userMap = new HashMap<Integer, String>();

		userMap.put(1, "Tom");
		userMap.put(2, "Naveen");
		userMap.put(3, "Ravi");
		userMap.put(4, "Pooja");

		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("Ravi", "SDET");
		empMap.put("Tom", "SDET Manager");
		empMap.put("Naveen", "QA");
//		empMap.put("Lisa", null);
//		empMap.put("LIPI", null);
		empMap.put(null, "Manager");// 0
		empMap.put(null, "Manager2");// 0
//		empMap.put("Naveen", "QA1");
		empMap.put("Rahul", "Dev");
		empMap.put("Rahul", "Dev2");

		System.out.println(userMap.get(1));//key
	    System.out.println(userMap.get(5));//key
		
		System.out.println(empMap.get("Tom"));//key
		System.out.println(empMap.get("Venkat"));//key

		System.out.println(empMap);

	}

}
