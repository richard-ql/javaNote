package ql;
/**
 * ��̬��ʼ�����ʹ��
 * @author issuser
 *
 */
public class User3 {
	int id;
	String name;
	String pwd;
	
	static String company="sxt";
	
	static {
		System.out.println("ִ����ĳ�ʼ������");
		company = "sxt123";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		
	}
}
