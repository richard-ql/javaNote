package ql;
/**
 * 测试多态
 * @author issuser
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		animalShout(new Animal());
		animalShout(new Dog());
		animalShout(new Cat());
		
		Animal a = new Animal();
		Animal d = new Dog();
		Dog d1 = (Dog) d;
		d1.watchDoor();
		Animal c = new Cat();
		Dog d2 = (Dog) c;    //编译时会报错
		d2.watchDoor();
	}
	
	static void animalShout(Animal a) {
		a.shout();
	}
}

class Animal{
	public void shout() {
		System.out.println("shout");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("wang wang wang");
	}
	public void watchDoor() {
		System.out.println("watch door");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("miao miao miao");
	}
}