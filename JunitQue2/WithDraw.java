package JunitQue3;

import java.util.Scanner;

public class WithDraw {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		BankAccount demoAccount = new BankAccount();
		
		demoAccount.showInfo();
		System.out.println("\n"+"enter amount to withdraw");
		
		double amount = a.nextDouble();
		try {
			demoAccount.withDraw(amount);
			
		}catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
	 

	}

}
