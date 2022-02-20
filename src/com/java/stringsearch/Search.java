package com.java.stringsearch;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String email[]=new String[5];
		email[0]="emp1@gmail.com";
		email[1]="emp2@gmail.com";
		email[2]="emp3@gmail.com";
		email[3]="emp4@gmail.com";
		email[4]="emp5@gmail.com";
		boolean s=false;
		
		
        System.out.println("Enter Employee Email ID ");
        String str=sc.next();
        System.out.println("Entered Email ID id: "+str);
        for (int i=0;i<email.length;i++)
        {
        	if(str.equals(email[i]))
        	{
        		s=true; 
        		break;
        	}
        }
        	if(s)
        	
        		System.out.println("Email Matched");
        	
        	else
        	
        		System.out.println("Email Not Found");
        	
		
		
	

	}

}

