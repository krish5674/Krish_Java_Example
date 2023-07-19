package corejava;

import java.util.Scanner;

public class Arraydemo {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array element :");
		for(i=0;i<a.length;i++);
		{
			System.out.print("enter"+(i+1)+"element");
			a[i]=sc.nextInt();
			
		}
		System.out.println("array element are : ");
		for(i=0;i<a.length;i++);
		{
			System.out.println("A["+i+"]="+a[i]);
		}
	}

}
