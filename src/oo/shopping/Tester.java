package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldenCustomer(10000));
		System.out.println("金額"+"\t折扣後"+"\t回饋金");
		for(Customer cust : list){
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer silver = (SilverCustomer)cust;
			}
			cust.print();
		}
		
		String[] array = {"aa","bb","cc"};
		// for each 迴圈
		for(String s : array){
			System.out.println(s);
		}
		// for i(index) 迴圈
		for(int i = 0; i < array.length; i++){
			String s = array[i];
			System.out.println(s);
		}
	}

}
