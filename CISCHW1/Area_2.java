package cis3150_hw1;

import java.util.Scanner;

public class Area_2 {
	 
	 public static  final double PI=3.1416;
	  static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		 System.out.print("Enter the radius: ");
		
		double r;
		double Area;
		while((r = key.nextDouble()) !=0){
		      
		      
		       
		       Area = PI*(Math.pow(r,2));
		     
		      System.out.printf("The area of the  circle is:%.2f\n" ,Area);
		      System.out.print("Enter the radius: ");
		      
		   
		}
		System.exit(0);
	}

}
