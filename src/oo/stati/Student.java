package oo.stati;

public class Student { // 如果把public刪掉 在其他package中無法import此類別的任何東西
	int english;
	int math;
	int chinese;
	static int pass = 60; // 加上static pass就變成類別變數

	public Student() {

	}

	static {
		System.out.println("Static!"); // static在沒有物件的情況下也會最先執行
		// System.out.println(english);(錯誤) 因為static在執行完後才跑出english物件
		System.out.println(pass); // 因為pass也是static
	}

	public Student(int english, int math, int chinese) {
//		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}

	protected String getScore(int score) { // protected才能讓GraduateStudent這個子類別使用
		if (score < pass) {
			return String.valueOf(score + "*");
		} else {
			return String.valueOf(score);
		}
	}
	@Override
	public String toString() {  //java自動繼承Object類別 Object中有toString方法
		return "english:" + english + "\n" + "chinese:" + chinese + "\n" + "math:" + math;
	}

}
