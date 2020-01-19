package ql;
/**
 * 静态初始化块的使用
 * @author issuser
 *
 */
public class User3 {
	int id;
	String name;
	String pwd;
	
	static String company="sxt";
	
	static {
		System.out.println("执行类的初始化工作");
		company = "sxt123";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		
	}
}
