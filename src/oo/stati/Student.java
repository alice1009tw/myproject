package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;  //加上static pass就變成類別變數
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
