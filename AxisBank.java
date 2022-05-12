package week3.day1;

public class AxisBank extends BankInfo {

	//week3.day1 assignment3 (override method)
	public static void main(String[] args) {
		
 //Create object for BankInfo and Axis Bank Classes and call the method 'deposit'
		BankInfo obj1 = new BankInfo();
		AxisBank obj2 = new AxisBank();
		
		obj1.deposit();
		obj2.deposit();
	}

	//Create method for 'deposit'
	public void deposit() {
		System.out.println("Overridden method -Deposit 5000 rupess");

	}

}
