package ql;
/**
 * static �ؼ��ֵ��÷�
 * @author issuser
 *
 */
public class User2 {
	int id;
	String name;
	String pwd;
	
	static String company="sxt";
	
	public User2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		System.out.println("��½��" + this.name);
		printCompany();
		User2.company = "sxt123";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101, "��У��");
		u.login();
	}
}
