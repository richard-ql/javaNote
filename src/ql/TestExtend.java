package ql;

public class TestExtend {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "gaoqi";
		stu.height = 170;
		stu.rest();
		
		Student stu1 = new Student();
		stu1.name = "xixi";
		stu1.height = 60;
		stu1.major = "math";
		stu1.study();
		
		System.out.println(stu1 instanceof Student);
		System.out.println(stu1 instanceof Person);
		System.out.println(stu1 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("take a rest");
	}
}

class Student extends Person{
	String major;
	
	public Student(String name, int height, String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student() {
		
	}
	
	public void study() {
		System.out.println("start study");
	}
}