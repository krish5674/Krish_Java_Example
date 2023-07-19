package com.Excepation;

public class CheckingAccount {
	
	int acno ;
	double balance;
	public CheckingAccount(int acno,double balance)
	{
		this.acno=acno;
		this.balance=balance;
		System.out.println("Hello "+this.acno+",Your Account Open With"+this.balance+"Rs");
		
	}
	public void Deposite(double Amount)
	{
		this.balance=this.balance+Amount;
	}
	public void Withdraw(double Amount)throws InSuficentFunds{
		if(Amount<=this.balance)
		{
			this.balance=this.balance-Amount;
		}
		else
		{	double need=Amount-this.balance;
			throw new InSuficentFunds(need);
		}
			
		}
	public void checkBalance ()
	{
		System.out.println("Current Balance : "+this.balance);
		
	}
	{
		
	}
}
