package corejava;

public class StaticMethod {
	
	static int a=10;
	static int b;
	
	{
		System.out.println("that is my 1st block");
	}
	StaticMethod()
	{
		System.out.println("i'm a student ");
	}
	static void Meth(int x )
	{
		System.out.println("x : "+x);
		System.out.println("A : "+a);
		System.out.println("b : "+b);
	}
	static 
	{
		System.out.println("static Block Initilized");
		b=a*5;
	}
	
	{
		System.out.println("that is my 2nd block");
	}
	public static void main(String[] args) {
		StaticMethod s = new StaticMethod();
		Meth(20);
	}

}
