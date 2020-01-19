package oop;

public class TestAnonymousClass {
	public static void test01(AA a) {
		System.out.println("#########");
		a.aa();
	}
	public static void main(String[] args) {
		TestAnonymousClass.test01(new AA() {
			public void aa() {
				System.out.println("TestAnonymousClass.main()new AA().aa()");
			}
		});
	}
}

interface AA{
	void aa();
}