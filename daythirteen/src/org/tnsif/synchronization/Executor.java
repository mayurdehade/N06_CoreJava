package org.tnsif.synchronization;

public class Executor {

	public static void main(String[] args) {
		Account accObj = new Account(101,"Mayur",10000);
		System.out.println("---------Account Details-------");
		System.out.println(accObj);
		AccountThread threadOne =new AccountThread(accObj);
		AccountThread threadTwo =new AccountThread(accObj);
		threadOne.setAmount(2000);
		threadOne.setType("withdraw");
		
		threadTwo.setAmount(8000);
		threadTwo.setType("withdraw");
		
		threadOne.start();
		threadTwo.start();
		
		try {
			threadOne.join();
			threadTwo.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(accObj);
	}
}
