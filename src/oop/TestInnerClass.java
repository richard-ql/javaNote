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
			System.out.println("�����ⲿ���Ա����age��"+ Outer.this.age);
			System.out.println("�����ڲ����Ա����age: "+ this.age);
			System.out.println("���ʾֲ�����age: "+ age);
		}
	}
}
