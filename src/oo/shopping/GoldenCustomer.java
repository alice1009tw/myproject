package oo.shopping;

public class GoldenCustomer extends Customer{
	
	public int bonus(int price){
		bonus = (int) (price*0.05);
		return bonus;
//		System.out.println("獲得5%回饋金："+bonus);
	}
}
