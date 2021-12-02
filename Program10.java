package com.demo;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		int watermelon;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the watermelon weight:");
		watermelon=sc.nextInt();
		if(watermelon%2==0) {
			System.out.println("i get "+watermelon/2+ "kgs and ny sibiling will get "+watermelon/2+"kgs");
			
		}
		else {
			System.out.println("you can't buy,please look for even weight watermelon");
		}
		for(int i=1;i<watermelon;i++) {
			System.out.println("possible ways of splitting " +i+ "  "+(watermelon-i));
		}
	}

}
