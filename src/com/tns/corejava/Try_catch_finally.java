package com.tns.corejava;

public class Try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[4];
		try
		{
			int  i= arr[4];
			System.out.println("inside the block");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Excepton catch in catch block");
	}
		finally {
			System.out.println("finally block");
			
		}
		System.out.println("outside the try catch finally clause");
	}

}
