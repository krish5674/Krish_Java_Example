package corejava;

import java.util.Scanner;

public class Exceptiondemo {
	
	public static void main(String[] args) {
		System.out.println("Start code : ");
	
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.print("Enter a : ");
		a=sc.nextInt();
		System.out.print("Enter b : ");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division : "+c);
		
		int arr[]= {1,2,3,4,5};
		System.out.print("Enter Index Number : ");
		int index=sc.nextInt();
		System.out.println("Array Element : "+arr[index]);
		}
		catch(Exception e )
		{
			System.out.println("Unvalid Number : "+e);
		}
		
		System.out.println("End code : ");
	}

}
