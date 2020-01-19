package oop;

public abstract class TestAbstractClass {
	//1.抽象类没有实现2.子类必须实现
	public abstract void shout();
	
	public void run() {
		System.out.println("跑啊跑");
	}
}

class Dog extends TestAbstractClass{

	@Override
	public void shout() {
		System.out.println("wang wang wang");
	}
	
}
