 package corejava;

import java.util.Scanner;

public class StaticVariable {

	static int a;
	void SetValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void PutValue()
	{
		System.out.println("a : "+a);
	}
	public static void main(String[] args) {
		
		StaticVariable s1 = new StaticVariable ();
		StaticVariable s2 = new StaticVariable ();
		StaticVariable s3 = new StaticVariable ();
		
		s1.SetValue();
		s2.SetValue();
		s3.SetValue();
		
		s1.PutValue();
		s2.PutValue();
		s3.PutValue();
		
	}
	
}
