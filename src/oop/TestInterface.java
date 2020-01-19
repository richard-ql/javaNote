package oop;

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		v.fly();
		Honest v1 = (Honest) v;
		v1.helpOther();
	}
}

interface Volant{
	int height = 1000;
	void fly();
}

interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");
		
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
		
	}
	
}