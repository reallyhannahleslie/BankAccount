// Test that you can't withdraw more than max amount

import org.Bank.CurrentAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTest {
    @Test
    public void DepositTest(){
        CurrentAccount ca = new CurrentAccount("Fin", 1400, 0);
        int depositAmount = 200;
        ca.Deposit(depositAmount);
        int finalBalance = ca.getBalance();
        int expectedFinalBalance = 1600;
        assertEquals(expectedFinalBalance, finalBalance);
    }

    @Test
    public void WithdrawTest(){
        CurrentAccount ca = new CurrentAccount("Fin", 1400, 0);
        int withdrawAmount = 200;
        ca.Withdraw(withdrawAmount);
        int finalBalance = ca.getBalance();
        int expectedFinalBalance = 1200;
        assertEquals(expectedFinalBalance, finalBalance);
    }
}

