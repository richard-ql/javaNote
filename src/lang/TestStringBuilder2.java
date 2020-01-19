package lang;

public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		for(int i=0; i<26; i++) {
			str.append((char)('a'+i));
		}
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		str.setCharAt(0, 'ÎÒ');
		System.out.println(str);
		str.insert(3, '°®').insert(6, 'Äã');
		System.out.println(str);
		str.delete(20, 23);
		System.out.println(str);
	}
}
