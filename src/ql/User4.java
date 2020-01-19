package ql;
/**
 * 参数传值
 * @author issuser
 *
 */
public class User4 {
	int id;
	String name;
	String pwd;
	
	static String company="sxt";
	
	public User4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameter01(User4 u) {
		u.name = "高校把";
	}
	
	public void testParameter02(User4 u) {
		u = new User4(102, "高校就");
		System.out.println("testParameter02: " + u.name);
	}
	
	public static void main(String[] args) {
		User4 u = new User4(101, "高校其");
		u.testParameter01(u);
		System.out.println(u.name);
		u.testParameter02(u);
		System.out.println(u.name);
	}
}
