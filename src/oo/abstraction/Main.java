package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		Car c = new Car("TOYOTA", 1800, "ALTIS", "SEDAN");
		c.setMilage(25000);
		//
		float current = c.addMilage(80);  //()內的參數型態要符合
		System.out.println("目前里程為:" + current);
	}

}
