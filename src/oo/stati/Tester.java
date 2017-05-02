package oo.stati;

import java.awt.List;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1 = new Student(88, 98, 65);
		Student stu2 = new Student(89, 56, 77);
		Student stu3 = new Student(58, 82, 64);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu1 = new GraduateStudent(68,77,88);
		GraduateStudent gstu2 = new GraduateStudent(73,65,90);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(88, 98, 65));
		list.add(new Student(89, 56, 77));
		list.add(new Student(58, 82, 64));
		list.add(new GraduateStudent(68,77,88));
		list.add(new GraduateStudent(73,65,90));
		for(int i=0; i<list.size(); i++){
			Student stu = list.get(i);
			stu.print();
		}
	}

}
