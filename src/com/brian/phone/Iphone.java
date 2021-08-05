package com.brian.phone;

public class Iphone extends Phone implements Ringable {
	public Iphone(String versionNumber, int batteryPercentage, 
			String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
//		System.out.println("Yo shun ur phone is ringin");
		return "Sprint Chime";
	}
	
	@Override
	public String unlock() {
		return "Click";
	}
	
	@Override
	public void displayInfo() {
		System.out.println(getVersionNum() + getCarrier());
	}
	
	

}
