package corejava;

import java.util.Scanner;

class A
{
	int a;
	void getA()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		
	}
	
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
	{
		int b;
		void getB()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter B : ");
			b=sc.nextInt();
			
		}
		
		void putB()
		{
			System.out.println("B : "+b);
		}
	}
class C extends B
{
	int c;
	void getC()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter C : ");
		c=sc.nextInt();
		
	}
	
	void putC()
	{
		System.out.println("C : "+c);
	}
}

public class multileveldemo {
	
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.getA();
		c1.getB();
		c1.getC();
		c1.putA();
		c1.putB();
		c1.putC();
		
	}
	  

}
