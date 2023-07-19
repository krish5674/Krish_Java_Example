package corejava;

import java.util.Scanner;

public class switchcashdemo {
	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		do {
		System.out.print("enter a :");
		a=sc.nextInt();
		System.out.print("enter b :");
		b=sc.nextInt();
		
		System.out.println("1. addition :");
		System.out.println("2. subtraction :");
		System.out.println("3. multiplication :");
		System.out.println("4. division :");
		System.out.println("5. exit :");
		System.out.println("your choice :");
		d=sc.nextInt();
		
		switch (d)
		{
		case 1 :
				c=a+b;
				System.out.println("addition is :"+ c);
				break;

		case 2 :
				c=a-b;
				System.out.println("substraction is :"+ c);
				break;

		case 3 :
				c=a*b;
				System.out.println("multipltion  is :"+ c);
				break;

		case 4 :
				c=a/b;
				System.out.println("divison is :"+ c);
				break;
		case 5 :
			    flag=false;
				break;
		default:
				System.out.println("invalid your number :");
				break;
				
		}
	}
		while(flag);
	
			
	}

}
