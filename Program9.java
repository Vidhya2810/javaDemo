package com.demo;

import java.util.Scanner;

public class Program9 {
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int target = 100,turn,total=0;
		for(int i=1;i<target;i++) {
		System.out.println("enter the turn");
		turn=sc.nextInt();
		
		total=total+turn;
		count++;
	    System.out.println("total is "+total);
	    
	    	 
	    	
	    	 if(total>=100)
	    	 {
	    System.out.println("number of turns" +count);
	    break;
	     }
		
	

	    }}}
