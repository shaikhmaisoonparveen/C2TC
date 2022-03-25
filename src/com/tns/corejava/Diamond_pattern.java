package com.tns.corejava;
import java.util.*;
public class Diamond_pattern {

	public static void main(String ...a) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		
		System.out .println("enter the number of row for half diamond:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=i;k++) {
				System.out .println("*");
			}
			System.out .println("");
		}
		for(i=1;i>=n;i--) {
			for(k=1;k>=i;k--) {
				System.out .println("*");
			}
			System.out .println("");
			}
		}
	}


