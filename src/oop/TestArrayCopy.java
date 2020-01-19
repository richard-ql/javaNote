package oop;

public class TestArrayCopy {
	public static void main(String[] args) {
		String[] a = {"a", "b", "c", "d"};
//		String[] b = new String[10];
//		System.arraycopy(a, 1, b, 6, 3);
//		
//		for(String m: b) {
//			System.out.println(m);
//		}
		
//		for(String m: remove(a, 3)) {
//			System.out.println(m);
//		}
		for(String temp: insertElement(a, 3, "e")) {
			System.out.println(temp);
		}
	}
	
	public static String[] remove(String[] str, int index) {
		System.arraycopy(str, index+1, str, index, str.length-index-1);
		str[str.length-1] = null;
		return str;
	}
	
	public static String[] insertElement(String[] s, int index, String element) {
		String[] s1 = new String[s.length+1];
		System.arraycopy(s, 0, s1, 0, s.length);
		System.arraycopy(s1, index, s1, index+1, s1.length-index-1);
		s1[index] = element;
		return s1;
	}
}
