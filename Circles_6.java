package cis3150_hw1;
import java.util.Scanner;

public class Circles_6 {

	public static void main(String[] args) {
		
		  
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter Circle 1 center x-, y-coordinates: ");
		    double X1 = input.nextDouble();
		    double Y1 = input.nextDouble();
		    System.out.print("Enter Circle 1  radius: ");
		    double radius1 = input.nextDouble();
		    System.out.print("Enter Circle 2 center x-, y-coordinates: ");
		    double X2 = input.nextDouble();
		    double Y2 = input.nextDouble();
		    System.out.print("Enter Circle 2  radius: ");
		    double radius2 = input.nextDouble();    
		    double distance = Math.pow((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2), 0.5);
		    if (radius2 >= radius1 && distance <= (radius2 - radius1)){
		        System.out.println("completely within one another.");
		    }
		    else if (radius1 >= radius2 && distance <= (radius1 - radius2) ) {
		        System.out.println("completely within one another");
		        		
		    }
		    else if (distance > (radius1 + radius2)){
		        System.out.println("separate from each other");
		    }
		    else if (distance < (radius1 + radius2)) {
		        System.out.println("Overlapping each other");}
		    }
		

	}


