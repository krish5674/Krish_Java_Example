package corejava;

import java.util.Scanner;

public class ladderifelse 
{
public static void main(String[] args) {
	
	int rno,s1,s2,s3,total,per;
	String name;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your roll no :");
	rno=sc.nextInt();
	System.out.println("enter your name : ");
	name=sc.next();
	System.out.println("enter your mark subject1 : ");
	s1=sc.nextInt();
	System.out.println("enter your mark subject2 : ");
	s2=sc.nextInt();
	System.out.println("enter your mark subject3 : ");
	s3=sc.nextInt();
	total=s1+s2+s3;
	per=total/3;
	
	System.out.println("roll no : "+rno);
	System.out.println("name : "+name);
	System.out.println("total : "+total);
	System.out.println("percentage : "+per);
	
	if(per>=70)
	  {
		System.out.println("distncation");
	  }
	else if(per>=60)
	  {
		System.out.println("first class");
	  }
	else if (per>=50)
	{
		System.out.println("second class");
	}
	else
	{
		System.out.println("fail");
	}
}
}
