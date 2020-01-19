package ql;

public class TestSuper {
	public static void main(String[] args) {
		System.out.println("start init Child object");
		new Child();
		
	}
}

class Father{
	public Father() {
		System.out.println("init Father object");
	}
}

class Child extends Father{
	public Child() {
		System.out.println("init Child object");
	}
}
