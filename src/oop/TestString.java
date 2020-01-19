package oop;

public class TestString {
	public static void main(String[] args) {
		String s = "core java";
		String s1 = "Core java";
		
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("asd"));
		System.out.println(s.replace(' ', '&'));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
	}
}
