package corejava;

class Base 
{
	Base()
	{
		System.out.println("Base's default constructor");	
	}
	void Show()
	{
		System.out.println("Show from Base");
	}
	
}
class Derived extends Base 
{
	Derived ()
	{
		System.out.println("Derived constructor");
	}
	void Show()
	{
		super.Show();
		System.out.println("Show from Derived");
	}
}
class SubDerived extends Derived
{
	 SubDerived ()
	{
		System.out.println("SubDerived constructtor");
	}
	 void Show()
	{
		 	super.Show();
			System.out.println("Show from SubDerived");
	} 
	 
}

public class ConstructorChainning {
	
	public static void main(String[] args) {
		
		SubDerived s = new SubDerived();
		s.Show();
	}

}
