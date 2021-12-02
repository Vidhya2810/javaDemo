package com.demo;

import java.util.Scanner;

public class Program8 {
    static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choclates,children;
     System.out.println("enter the no. of choclates");
     choclates=sc.nextInt();
     System.out.println("enter the no. of children");
     children=sc.nextInt();
     for(int i=1;i<children;i++) {
    	 if(choclates>=i) {
    		 choclates=choclates-i;
    		 count++;
    	 }
     }
     System.out.println("choclate remaining "+choclates);
     System.out.println("number of children got the choclates" +count);
	}

}
