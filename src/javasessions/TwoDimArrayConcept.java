package javasessions;

import java.util.Arrays;

public class TwoDimArrayConcept {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][5];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 250;
		
		System.out.println(arr.length);
		System.out.println(Arrays.deepToString(arr));
		System.out.println("2d array vindhya length is depends on rows");

		//Array Literals:
		
		int num[][] = {
				{1,2,3},
				{2,3,4},
				{4,5,6}
		};
		
		System.out.println(num.length);
		System.out.println("2d array literals vindhya");
		
		System.out.println(Arrays.deepToString(num));
		System.out.println("------------------");

		//to iterate 2D array: use two loops: outer-inner loops
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[0].length; col++) {
				System.out.print(num[row][col] + " ");//[0][0]=1 2 3
				//break;
			}			
			System.out.println();
		}
	
		Object empInfo[][] = {
				{"Neha", 25, "SDET1", true, "vin1"},
				{"Vijay", 27, "SDET2", false, "vin2"},
				{"Rahul", 28, "SDET Manager", true, "vin3"}
		};
		
		System.out.println(empInfo.length);
		System.out.println(empInfo[0].length);
		
//		for(int row=0; row<empInfo.length; row++) {
//			for(int col=0; col<empInfo[0].length; col++) {
//				System.out.print(empInfo[row][col] + " ");
//			}
//			
//			System.out.println();
//			
//		}
		
		//thi is 2d array print by using for each loop as homework 
		
		for(Object row[]: empInfo) {
			for(Object col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
		
		
		
	

	


