package corejava;

import java.util.Scanner;

class X
{
	int x;
	void getX()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		x=sc.nextInt();
		
	}
	
	void putX()
	{
		System.out.println("A : "+x);
	}
}
class Y extends X
	{
		int y;
		void getY()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter B : ");
			y=sc.nextInt();
			
		}
		
		void putY()
		{
			System.out.println("B : "+y);
		}
	}


public class inhenitancedemo {
	
	public static void main(String[] args) {
		
	 Y Y1 = new Y ();
     Y1.getX();
     Y1.getY();
     Y1.putX();
     Y1.putY();
		
	}
	  

}
