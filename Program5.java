package com.demo;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int total = 0,wd,we;
        System.out.println("enter the total salary paid: ");
        total=sc.nextInt();
        we=(total-800)/130;  //calculating hour
        wd=we+10;
        System.out.println("number of weekday hour is "+wd);
        System.out.println("number of weekend hour is "+we);
	}

}
