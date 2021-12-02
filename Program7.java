package com.demo;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total;
		int p1,p2,p3;
		double offer1,offer2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price 1 : ");
        p1=sc.nextInt();
        System.out.println("enter the price 2 : ");
        p2=sc.nextInt();
        System.out.println("enter the price 3 : ");
        p3=sc.nextInt();
        total=p1+p2+p3;
        System.out.println("total amount is : "+total);
        offer1=total*0.2;
      
        
        
        if(p1<p2 && p1<p3) {
        	offer2=p1;
        }
        else if(p2<p3) {
        	offer2=p2;
        }
        else {
        	offer2=p3;
        }
        if(offer1>offer2) {
        	System.out.println("offer 1 is best for customer : "+offer1);
        	
        }else {
        	System.out.println("offer 2 is best for customer : "+offer2);
        }
        System.out.println("offer details:");
        System.out.println("offer 1 price "+offer1);
        System.out.println("offer 2 price "+offer2);

	}

}
