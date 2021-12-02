package com.demo;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int crunrate;
      int runrate;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of overs");
      int a=sc.nextInt();
      System.out.println("enter the target runs");
      int b=sc.nextInt();
      System.out.println("enter the overs bowled");
      int c=sc.nextInt();
      System.out.println("enter runs scored");
      int d=sc.nextInt();
      runrate=(int)(b-d)/(a-c);
      System.out.println(runrate);
      crunrate=d/c;
      System.out.println(crunrate);
      
	}

}
