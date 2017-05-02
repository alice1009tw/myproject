package oo.stati;

public class GraduateStudent extends Student{
	//繼承屬性 但*不繼承建構子*
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	@Override  //幫助檢查複寫是否有誤
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
		//getScore前面改成protected才能讓這個子類別使用
	}
}
