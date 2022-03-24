package com.tns.corejava;
import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any number:");
		
		Scanner input=new Scanner (System.in);
		n=input.nextInt();
		
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}

}
