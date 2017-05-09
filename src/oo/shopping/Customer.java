package oo.shopping;

import java.util.ArrayList;

public class Customer {
	public Customer(){
		
	}
	
	public Customer(int i){
		
	}
	public void selling(){
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new Customer(8000));
		list.add(new Customer(10000));
		list.add(new Customer(30000));
		list.add(new Customer(2000));
		list.add(new Customer(10000));
		for(int n=0; n<list.size(); n++){
			System.out.println(list.get(n));
		}
	}
}
