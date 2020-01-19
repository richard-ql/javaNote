package exception;


public class TestException2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-1);
	}
}

class Person{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalAgeException("年龄不能小于0");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


class IllegalAgeException extends RuntimeException{	
	public IllegalAgeException(String msg) {
		super(msg);
	}
}
