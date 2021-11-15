package JunitQue3;

import static org.junit.Assert.assertEquals;

import JunitQue3.BankAccount;

public class WithDrawTest {
	void test() {
		BankAccount demoaccount = new BankAccount();
		String exception ="";
		try {
			demoaccount.withDraw(10000);
			
		}catch (Exception e) {
			exception = e.toString();
		}
		
		assertEquals(exception,"Junit.InsufficientBalanceException");
	}

}
