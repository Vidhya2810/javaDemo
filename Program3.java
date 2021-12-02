package com.demo;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double total;
       double bp;
       double tp;
       double fp;
       double lp;
       
       
       Scanner sc=new Scanner(System.in);
       System.out.println("enter branding expenses");
       double b=sc.nextInt();
       System.out.println("enter travel expenses");
       double t=sc.nextInt();
       System.out.println("enter food expenses");
       double f=sc.nextInt();
       System.out.println("enter logistic expenses");
       double l=sc.nextInt();
       total= b+t+f+l ;
       System.out.println("total expenses:" +total );
       bp=(b/total)*100;
       System.out.println("b expenses:" +bp );
       tp=(t/total)*100;
       System.out.println("t expenses:" +tp );
       fp=(f/total)*100;
       System.out.println("f expenses:" +fp );
       lp=(l/total)*100;
       System.out.println("l expenses:" +lp );
	}

}
