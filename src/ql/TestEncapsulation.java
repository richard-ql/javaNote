package ql;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.name;
	}
}

class Human{
	private int name;
	
	void say() {
		System.out.println(name);
	}
}

class boy extends Human {
	
	void say() {
//		System.out.println(name);
	}
}