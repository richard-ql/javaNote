package collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
		c.add("�Ұ���������");
		c.add("���ط�����˾����");
		System.out.println(c);
		System.out.println(c.contains("�Ұ���������"));
		c.remove("�Ұ���������");
		System.out.println(c);
		c.clear();
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
	}
}
