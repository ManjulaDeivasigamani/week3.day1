package org.system;

public class Desktop extends Computer {
	
//week3.day1 Assignment1: Program to call all class methods using single inheritance 	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktop();
	}
	
//Create method 'desktop'
	public void desktop() {
		System.out.println("Desktop size is 15inch");
	}

}
