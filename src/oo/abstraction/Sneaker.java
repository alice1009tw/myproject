package oo.abstraction;

public class Sneaker {
	String brand;
	float size;
	String color;
	String function;
	int publish;
	int amount;
	int buyamount;
	public Sneaker(String brand, float size, String color, String function){
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.function = function;
	}
	public Sneaker(String brand, String color){
		this(brand, 7.5f, color, "");
	}
	
	public void abc(){
		
	}
	
	public void setAmount(int n){
		amount = n;
	}
	
	public int minusAmount(int n){
		amount = n-buyamount;
		return amount;
	}
}
