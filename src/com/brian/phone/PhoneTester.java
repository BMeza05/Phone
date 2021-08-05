package com.brian.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s7 = new Galaxy("s7", 82, "T-mobile", "Ring^7, Banana Phone!");
		Iphone iphoneSE = new Iphone("iphone-SE", 63, "Sprint", "Driingg, Driiing");
		
		s7.displayInfo();
		System.out.println(s7.ring());
		System.out.println(s7.unlock());
		
		iphoneSE.displayInfo();
		System.out.println(iphoneSE.ring());
		System.out.println(iphoneSE.unlock());
	}

}
