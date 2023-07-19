package com.Excepation;

import java.util.Scanner;

public class Bankdemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CheckingAccount c = new  CheckingAccount (101,1000);
		
		while(true)
		{
			System.out.println("**************");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.exit");
			System.out.println("**************");
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			System.out.println("**************");
			if(choice==1)
			{
				System.out.println("Enter Deposite Amount : ");
				double amount=sc.nextDouble();
				System.out.println("**************");
				c.Deposite(amount);
			}
			else if (choice==2)
			{
				try {
					System.out.println("Enter Withdraw Amount : ");
					double amount=sc.nextDouble();
					System.out.println("**************");
					c.Withdraw(amount);
				}
				catch(InSuficentFunds e) {
					System.out.println("Sorry You Need Anither : "+e.getAmount()+"Rs");
					System.out.println("**************");
				}
			}
			else if (choice==3)
			{
				c.checkBalance();
				System.out.println("**************");
			}
			else {
				break;
			}
		}
		
	}

}
