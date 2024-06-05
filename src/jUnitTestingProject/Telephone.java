package jUnitTestingProject;

public class Telephone {
	private boolean isOnCall;
	private String currentNumber;
	
	public Telephone() {
		this.isOnCall=false;
		this.currentNumber=null;
	}
	
	public boolean dial(String number) {
		if(this.isOnCall) {
			return false;
		}
		this.currentNumber=number;
		return true;
	}
	
	public boolean makeCall() {
		if(this.currentNumber==null) {
			return false;
		}
		this.isOnCall=true;
		return true;
	}
	
	public boolean hangUp() {
		if(!this.isOnCall) {
			return false;
		}
		this.isOnCall=false;
		this.currentNumber=null;
		return true;
	}
	
	public boolean isOnCallRet() {
		return this.isOnCall;
	}
	
	public String getCurrentNumber() {
		return this.currentNumber;
	}
	
}
