package lang;

public class TestString {
	public static void main(String[] args) {
		String str1 = "hello"+"java";
		String str2 = "hellojava";
		System.out.println(str1 == str2);
		
		String str3 = "hello";
		String str4 = "java";
		String str5 = str3 + str4;
		System.out.println(str2 == str5);
		
		System.out.println(str2.equals(str5));
	}
}
