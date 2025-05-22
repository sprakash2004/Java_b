package com.tns.day8.Interface;

public class BankImpl implements Bank{

	@Override
	public void deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		if(amount>DEPOSIT_LIMIT) 
			System.err.println("Deposit not possible.. exceeds Deposit Limit");
		else
			account.setBalance(account.getBalance()+amount);
	System.out.println("Deposited"+ amount+"into account: "+account.getAccNo());
	}

	public void withdraw(Account account, double amount) {
		if(account.getBalance()- amount >=MIN_BALANCE) 
			account.setBalance(account.getBalance()-amount);
		else
			acount
	}
	@Override
	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
		
	}

}
