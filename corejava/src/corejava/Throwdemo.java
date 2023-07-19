package corejava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwdemo {
	
	public static void demo()throws ArithmeticException,InputMismatchException,ArrayIndexOutOfBoundsException
	{
	int x;
	Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter A : ");
		x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("Square Of "+x+"Is"+(x*x));
		}
		else
		{
			throw new ArithmeticException("Please Enter positive value only ");
		}
		
		}
	
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally block ");
		}
		
		
	}	

}
