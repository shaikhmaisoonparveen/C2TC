package com.tns.corejava;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=5;
boolean isPrime =true;
for(int i=2; i<number/2;i++)
{
	if(number % 1==0)
	{
		isPrime=false;
	}
}
if(isPrime==true)
{
	System.out.println("The number is prime number");
}else {
	System.out.println("The number is not prime number");
}
	}

}
