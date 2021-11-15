package JunitQue3;

import JunitQue3.InsufficientBalanceException;

public class BankAccount {
	long loginID=98765;
	double balance=25000;
	
	public void showInfo() {
		System.out.println("LogID:"+loginID+"\n"+"Balance:"+balance);
		
	}
	public void withDraw(double amount) throws InsufficientBalanceException{
		if(balance < amount || balance ==0) {
			throw new InsufficientBalanceException();
			
		}else {
			balance -=amount;
			System.out.println("your money:"+amount);
		}
	}

}
