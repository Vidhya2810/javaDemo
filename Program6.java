package com.demo;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,n1,n2,n3,n4,n5,n6;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the amount: ");
       n=sc.nextInt();
       n1=n/100;
       n2=n/50;
       n3=n/10;
       n4=n/5;
       n5=n/2;
       n6=n;
       System.out.println("currency domination are: " );
       System.out.println("number of 100 notes "+n1);
       System.out.println("number of 50 notes "+n2);
       System.out.println("number of 10 notes "+n3);
       System.out.println("number of 55 notes "+n4);
       System.out.println("number of 2 notes "+n5);
       System.out.println("number of 1 notes "+n6);
	}

}
