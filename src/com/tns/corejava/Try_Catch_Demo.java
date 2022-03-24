package com.tns.corejava;

public class Try_Catch_Demo {

	public static void main(String[] args) {
		System.out.println("m11 is best");
		try {
			System.out.println(20/0);
		}
catch (ArithmeticException e){
	System.out.println("Don't divide by zero");
}
		System.out.println("m11 is Dirty");
	}

}
