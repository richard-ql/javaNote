package oop;

public class TestInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.testInner();
	}
}

class Outer{
	private int age = 10;
	
	public void testOuter() {
		
	}
	
	class Inner{
		private int age = 20;
		
		public void testInner() {
			int age = 30;
			System.out.println("访问外部类成员变量age："+ Outer.this.age);
			System.out.println("访问内部类成员变量age: "+ this.age);
			System.out.println("访问局部变量age: "+ age);
		}
	}
}
