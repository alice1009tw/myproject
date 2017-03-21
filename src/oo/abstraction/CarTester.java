package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("TOYOTA", 1800, "ALTIS", "SEDAN");
//		c1.brand = "TOYOTA";
//		c1.cc = 1800;
//		c1.name = "ALTIS";
		
		Car c2 = new Car("HONDA", 2000, "ACCORD", "");
		Car c3 = new Car("TOYOTA", 2000, "WISH", "");
		int[] n = new int[5];
		System.out.println(n[2]);  //自動給定初始值0
		
		Car[] cars = new Car[3];
		System.out.println(cars[0]);
		cars[0] = new Car("TOYOTA", 1800, "ALTIS", "SEDAN");
		cars[1] = new Car("HONDA", 2000, "ACCORD", "");
		cars[2] = new Car("TOYOTA", 2000, "WISH", "");
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
		System.out.println(cars[0].name);
		int i = 0;
		for(i=0; i<3; i++){
			System.out.println(cars[i].name);
		}
		System.out.println(i);  //如果沒有int i = 0; i出了迴圈就不存在了
		
		class AA{
			AA a = new AA();
		}
	}

}
