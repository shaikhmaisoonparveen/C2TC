package com.tns.corejava;
import java.util.*;
public class Exception {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age ...");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age<18) {
			System.out.println("you are eligible for voting");
			}else {
				System.out.println("you are not eligible for voting");
			}
	}

}
class CantVote extends RuntimeException
{
   CantVote(String msg) {
	super(msg);
}
}