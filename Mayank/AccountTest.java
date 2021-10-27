package Mayank;

public class AccountTest {
public static void main(String[] args) {
	Account acc = new Account ();
	acc.setNumber("3535347685346");
	acc.setAccType("Saving Account");
	acc.setBalance(10000);
	
	System.out.println(acc.getNumber());
	System.out.println(acc.getAccType());
	System.out.println(acc.getBalance());
	System.out.println();
	acc.deposite(520);
	acc.withdrawal(780);
	acc.fundTransfer(310);
	acc.paybill(630);
	System.out.println();
	System.out.println("Balance nahi hai");
}   
}
