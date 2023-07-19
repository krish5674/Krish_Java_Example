package corejava;

import java.util.Scanner;

public class ifcondition {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value a : ");
		a=sc.nextInt();
		System.out.print("enter value b : ");
		b=sc.nextInt();
		System.out.print("enter value c : ");
		c=sc.nextInt();
		if (a>b) 
		{
			if(a>c)
			{
			System.out.println("a is max");
		}
		    else
	    {
			System.out.println("c is max ");
		}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is max");
			}
			else
			{
				System.out.println("c ia max");
				
				
			}
		}
		
	}

}
