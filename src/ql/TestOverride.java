package ql;
import ql.TestExtend;

public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("run....");
	}
	
	public void stop() {
		System.out.println("stop....");
	}
	
	public Person psg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("dedede...");
	}
	
	public Student psg() {
		return new Student();  //返回值Student小于等于Person
	}
}