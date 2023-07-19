package corejava;

import java.util.Scanner;

public class TwoDArraydemo {
	
	public static void main(String[] args) {
		
	int a[] [] = new int [3][3];
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter TwoD Array : ");
	for(i=0;i<a.length;i++);
	{
		for(j=0;j<a.length;j++);
		{
		
			System.out.println("Enter  " +i+ " Rows & "+j+" Colume : ");
			a[i][j]=sc.nextInt();
			
			
		}
	}
		
	}

}
