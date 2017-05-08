package oo.abstraction;

import java.util.ArrayList;

public class TruckTester {

	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("Toyota",2000,"Wish",""));
		list.add(new Truck("Toyota",1800,"Altis","Sedan"));
		list.add(new Truck("Honda",2000,"Accord",""));
		for(int i=0; i<list.size(); i++){
			Car car = list.get(i);
			car.print();
		}
	}

}
