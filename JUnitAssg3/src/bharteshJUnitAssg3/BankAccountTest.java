package bharteshJUnitAssg3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	@DisplayName("Testing Balance")
	void test() {
		BankAccount bank=new BankAccount();
		
		  try{ bank.withdraw(21000.00);
		  
		  }catch(InsufficientFundException e) {
			  System.out.println(e);
		  }
		 
	}

}
