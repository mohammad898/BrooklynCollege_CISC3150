package cis3150_hw1;



	import java.io.*;
	import java.util.Scanner;

	public class CommandLine_4
	{
	   public static void main(String[] args)
	   {
	      File file;
	      Scanner inputFile;
	      Scanner keyboard = new Scanner(System.in);
	      System.out.println("Please enter file's name:");
	      String fileName = keyboard.nextLine();    
	      
	      try
	      {
	      file = new File(fileName);
	      inputFile = new Scanner(file);
	      System.out.println("The file was found.");
	      while(inputFile.hasNext())
	      {
	         System.out.println(inputFile.nextLine());
	      }
	      
	      inputFile.close();
	      }
	      
	      catch(FileNotFoundException e)
	      {
	         System.out.println("File not found.");
	      }
	      
	      
	     
	   }
	}


