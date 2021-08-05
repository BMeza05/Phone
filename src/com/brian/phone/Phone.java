package com.brian.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	public Phone(String versionNumber, int batteryPercentage, 
			String carrier, 
			String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	public abstract void displayInfo();
	
	
	//getters
	public String getVersionNum(){
		return versionNumber;
	}
	
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	
	public String getCarrier() {
		return carrier;
	}
	
	public String getRingTone() {
		return ringTone;
	}
	//--------------
	//setters
	
	public void setVersionNum(String VersionNum) {
		versionNumber = VersionNum;
	}
	
	public void setBatteryPercentage(int BatteryPercent) {
		batteryPercentage = BatteryPercent;
	}
	
	public void setCarrier(String Carrier) {
		carrier = Carrier;
	}
	
	public void setRingTone(String RingTone) {
		ringTone = RingTone;
	}
}
