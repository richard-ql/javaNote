package oop;

public abstract class TestAbstractClass {
	//1.������û��ʵ��2.�������ʵ��
	public abstract void shout();
	
	public void run() {
		System.out.println("�ܰ���");
	}
}

class Dog extends TestAbstractClass{

	@Override
	public void shout() {
		System.out.println("wang wang wang");
	}
	
}
