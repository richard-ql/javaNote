package lang;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("aaabbbccc");
		System.out.println(Integer.toHexString(str.hashCode()));
		System.out.println(str);
		
		str.setCharAt(2, 'M');
		System.out.println(Integer.toHexString(str.hashCode()));
		System.out.println(str);
		
	}
}
