package corejava;

import java.util.Scanner;

public class variabledemo {
	public static void main(String[] args) {
		int a,b,c ;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a =");
		a=sc.nextInt();
		System.out.print("enter b =");
		b=sc.nextInt();
		c=a+b;
		System.out.println("addition="+c);
		c=a-b;
		System.out.println("subtraction :"+c);
		c=a*b;
		System.out.println("multiplication :"+c);
		c=a/b;
		System.out.println("division :"+c);
		
	}

}
