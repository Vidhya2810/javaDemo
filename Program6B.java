package com.demo;

import java.util.Scanner;

public class Program6B {

	public static void countCurrency(int amount)
	
    {
        int[] notes = new int[]{100,50,10, 5,2, 1 };
        int[] noteCounter = new int[6];
      
  
        for (int i = 0; i < 6; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
 
        System.out.println("currency denomination are:");
        for (int i = 0; i < 6; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }

    public static void main(String argc[]){
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the amount: ");
        //int amount = sc.nextInt();
        countCurrency(sc.nextInt());
    }
     
  
}
