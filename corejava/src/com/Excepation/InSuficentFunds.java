package com.Excepation;

public class InSuficentFunds extends Exception{
	double Amount;
	public InSuficentFunds(double Amount) {
		this.Amount=Amount;
		
	}
	public double getAmount() {
		return this.Amount;
	}
}
