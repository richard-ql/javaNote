package collection;

import java.util.HashMap;

public class HashSet1 {
	HashMap map;
	
	private static final Object PRESENT = new Object();
	
	public HashSet1() {
		map = new HashMap();
	}
	
	public int size() {
		return map.size();
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("{");
		for(Object e: map.keySet()) {
//			System.out.println(e.toString());
			str.append(e.toString()+",");
		}
		str.setCharAt(str.length()-1, '}');
		return str.toString();
	}
	
	public static void main(String[] args) {
		HashSet1 s = new HashSet1();
		s.add("aa");
		s.add("bb");
		s.add("cc");
		System.out.println(s);
	}
}
