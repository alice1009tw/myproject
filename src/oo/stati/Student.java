package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;  //加上static pass就變成類別變數
	static{
		System.out.println("Static!");  //static在沒有物件的情況下也會最先執行
//		System.out.println(english);(錯誤)  因為static在執行完後才跑出english物件
		System.out.println(pass);  //因為pass也是static
	}
	public Student (int english, int math, int chinese){
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese));
	}
	
	private String getScore(int score){
		if(score<pass){
			return String.valueOf(score+"*");
		}else{
			return String.valueOf(score);
		}
	}
}
