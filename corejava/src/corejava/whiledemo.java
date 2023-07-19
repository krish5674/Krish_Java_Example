package corejava;

import java.util.Scanner;

public class whiledemo {
	
	public static void main(String[] args) {
		
		int n ,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n :");
		n=sc.nextInt();
		while(n>0)
			{
				sum=sum+n;
				n=n-1;
			}
		System.out.println("sum :"+sum);
		
	}

}
