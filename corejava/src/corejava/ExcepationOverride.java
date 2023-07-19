package corejava;

import java.util.InputMismatchException;

class Ex1
{
	void Show () throws ArithmeticException
	{
		System.out.println("Show From Ex1");
	}
}
class Ex2 extends Ex1
{
	void Show () throws InputMismatchException
	{
		System.out.println("Show From Ex1");
	}
}

public class ExcepationOverride {

}
