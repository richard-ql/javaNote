package ql;

public class User {
	int id;
	String name;
	String pwd;
	
	public User() {
	}
	
	public User(int id, String name) {
		super(); //��������һ�䶼��super,��дҲû��ϵ���������Զ�����
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
		User u2 = new User(101, "��У��");
		User u3 = new User(102, "�ߴ���", "123456");
	}
}
