package com.brian.phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, 
			String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	
	
	
	@Override
	public void displayInfo() {
		System.out.println(getVersionNum() + getCarrier());
	}




	@Override
	public  String ring() {
		// TODO Auto-generated method stub
		return "Drrrring DRRRing";
	}




	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Click";
	}
	
}
