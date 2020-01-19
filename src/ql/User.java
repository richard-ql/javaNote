package ql;

public class User {
	int id;
	String name;
	String pwd;
	
	public User() {
	}
	
	public User(int id, String name) {
		super(); //构造器第一句都是super,不写也没关系编译器会自动加上
		this.id = id;
		this.name = name;
	}
	
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(101, "高校其");
		User u3 = new User(102, "高达七", "123456");
	}
}
