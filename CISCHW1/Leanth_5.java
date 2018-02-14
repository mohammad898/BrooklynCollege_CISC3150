package cis3150_hw1;

import java.util.Scanner;

public class Leanth_5 {

	public static void main(String[] args) {
		double d=(Math.sqrt(Math.pow((5-1),2) +Math.pow((4-1),2)));
		 
    	 int A_x1,A_y1;
    	 
    	 int B_x2,B_y2;
    	 int C_x3,C_y3;
    
double length_BtoA,length_CtoA,length_CtoB;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter A_x1 point");

        A_x1=sc.nextInt();

        System.out.println("Enter A_y1 point");

        A_y1=sc.nextInt();

    System.out.println("Enter B_x2point");

        B_x2=sc.nextInt();

    System.out.println("Enter B_y2 point");

        B_y2=sc.nextInt();
        System.out.println("Enter C_x3 point");

        C_x3=sc.nextInt();

    System.out.println("Enter C_y3 point");

        C_y3=sc.nextInt();
	    
	    
    
     length_BtoA=(Math.sqrt(Math.pow((B_x2-A_x1),2) +Math.pow((B_y2-A_y1),2)));
	    
     length_CtoA=(Math.sqrt(Math.pow((C_x3-A_x1),2) +Math.pow((C_y3-A_y1),2)));
      length_CtoB=(Math.sqrt(Math.pow((C_x3-B_x2),2) +Math.pow((C_y3-B_y2),2)));
	    
	   
	    	 	    
       System.out.printf("Length_(B-A)=%.2f\n" ,length_BtoA);
	    	 	    
       System.out.printf("Length_(C-A)=%.2f\n" ,length_CtoA);
       System.out.printf("Length_(C-B)=%.2f\n" ,length_CtoB);
      
      if ((length_BtoA>length_CtoA) && (length_BtoA>length_CtoB))
      
      {
    	 
    	  if((length_CtoA +length_CtoB)>length_BtoA)
    		  System.out.println("Real Tringle");
    	  else
    		  System.out.println(" Not a Real Tringle");
      }
      
      if ((length_CtoA>length_BtoA) && (length_CtoA>length_CtoB))
      {
    	  if((length_BtoA +length_CtoB)>length_CtoA)
    		  System.out.println("Real Tringle");
    	  else
    		  System.out.println(" Not a Real Tringle");
    		  
    		  
      }
    
      
      if ((length_CtoB>length_BtoA) && (length_CtoB>length_CtoA))
      {
    	  if((length_BtoA +length_CtoA)>length_CtoB)
    		  System.out.println("Real Tringle");
    	  else
    		  System.out.println(" Not a Real Tringle");
      }
     
}



	}


