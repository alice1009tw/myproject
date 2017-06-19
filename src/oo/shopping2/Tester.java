package oo.shopping2;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new NormalCustomer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new NormalCustomer(2000));
		list.add(new GoldenCustomer(10000));
		System.out.println("金額"+"\t折扣後"+"\t回饋金");
		for(Customer cust : list){
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
				System.out.print("S*");
			}else if(cust instanceof GoldenCustomer && !(cust instanceof SilverCustomer)){
				System.out.print("G*");
			}
			cust.print();
		}
	}

}
