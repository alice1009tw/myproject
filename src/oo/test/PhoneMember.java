package oo.test;

public class PhoneMember extends Member{
	String phone;
	boolean verified = false;
	public String getPhone(){
		return phone;
	}
	public void setPhone(){
		this.phone = phone;
	}
	public boolean isVerified(){  //boolean的getter是用is命名
		return verified;
	}
	public void setVerified(){
		this.verified = verified;
	}
}
