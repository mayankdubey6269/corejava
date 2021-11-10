package Mayank;

public class Account {
private String number;
private String accType;
private int balance;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public void deposite (int d){
	balance = balance+d;
	System.out.println("Deposite +"+d);
	
}public void withdrawal(int w){
	balance =  balance-w;
	System.out.println("Withdrawal -"+w);
	
}public void fundTransfer(int ft){
	  balance = balance-ft;
	  System.out.println("FundTransfer -"+ft);
	  
	  
}  public void paybill (int p){
	balance = balance-p;
	System.out.println("Paybill -"+p); 
}
}