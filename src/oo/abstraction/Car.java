package oo.abstraction;

public class Car {  //能見度：public(就算不同pakage也可以使用
	String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	
	public Car(){
		
	}
	
	public Car(String brand, String name){
		this(brand, 0, "", "");
	}
	
	public Car(String brand, int cc, String name, String type){ //brand,cc,name,type是區域變數local variable
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;   // 等號後面的是local variable
	}  //這是一個方法叫Car
	
	public void xxxx(){ //回傳值是void(不用回傳)  xxxx()內放參數
		//xxxx方法
	}
	
	public void setMilage(int m){  //java的方法名稱第一個單字要全小寫
		milage = m;
	}
	
	public float addMilage(int m){
		milage = milage + m;
		return milage;  //return milage的float值
	}
	
	public void maintain(){
		status = 5;
	}
	
	public void print(){
		System.out.println(brand+"\t"+cc+"\t"+name+"\t"+type);
	}
}
