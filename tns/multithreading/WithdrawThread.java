//Program to illustrate synchronization
package com.tns.multithreading;

public class WithdrawThread extends Thread{
    Account a1;
    int amt;
	public WithdrawThread(Account a1, int amt) {
		this.a1 = a1;
		this.amt = amt;
	}
	@Override
	public void run() {
		 try {
			 Thread.sleep(2000);
			
			 a1.withdraw(amt);
			 System.out.println("Withdraw Successful...");
	
		 }

catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
		
	}	
}