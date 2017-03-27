package oo.abstraction;

public class SneakerTester {

	public static void main(String[] args) {
		Sneaker s1 = new Sneaker("Nike", (float)7.5, "Black", "Running");
		Sneaker s2 = new Sneaker("Adidas", 6, "White", "Trainig");
		Sneaker s3 = new Sneaker("Vans", 8, "blue", "Walking");
		int[] n = new int[5];
		System.out.println(n[4]);
		
		Sneaker[] sneakers = new Sneaker[3];
		System.out.println(sneakers[1]);
		sneakers[0] = new Sneaker("Nike", (float)7.5, "Black", "Running");
		sneakers[1] = new Sneaker("Adidas", 6, "White", "Trainig");
		sneakers[2] = new Sneaker("Vans", 8, "blue", "Walking");
		sneakers[0].publish = 1997;
		sneakers[1].publish = 2000;
		sneakers[2].publish = 1966;
		System.out.println(sneakers[1].color);
		int i = 0;
		for(i=0; i<3; i++){
			System.out.println(sneakers[i].function);
		}
	}

}
