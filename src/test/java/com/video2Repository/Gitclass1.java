package com.video2Repository;

public class Gitclass1 {

	public static void main(String[] args) {
		int [] A= {23,45,56,67};

		int Sum=0;

		for(int i:A) {
			
			Sum +=i;
					
		}
		System.out.println("Sum"+ Sum);	
		int Avg = Sum/A.length ;
		System.out.println("Avg"+ Avg);
				
			}

}
