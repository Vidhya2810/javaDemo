package com.demo;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   double totalAvg;
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number of people who watched show 1");
	       int s1=sc.nextInt();
	       System.out.println("Enter the average rating for show 1");
	       float r1=sc.nextInt();
	       System.out.println("Enter the number of people who watched show 2");
	       int s2=sc.nextInt();
	       System.out.println("Enter the average rating for show 2");
	       float r2=sc.nextInt();
	       System.out.println("Enter the number of people who watched show 3");
	       int s3=sc.nextInt();
	       System.out.println("Enter the average rating for show 3");
	       float r3=sc.nextInt();
	       totalAvg=(r1+r2+r3)/3;
	       System.out.println("The overall average rating for the show is "+totalAvg);
	      
	       
	}

}
