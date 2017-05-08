package oo.abstraction;

public class Truck extends Car{
	int status;
	public Truck(String brand, int cc, String name, String type){
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;
	}
	@Override
	public void print(){
		System.out.println(brand+"\t"+cc+"\t"+name+"\t"+type+"\t"+status);
	}
}
