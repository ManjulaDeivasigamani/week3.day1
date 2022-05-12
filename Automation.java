package week3.day1;

public class Automation implements Language, TestTool {

	public static void main(String[] args) {

		// implement the methods of interfaces Language, TestTool to Automation class
		
		//create an object for automation class and call all the methods
		Automation auto = new Automation();

		auto.selenium();
		auto.java();
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Print Selenium");	
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Print Java");
	}

}
