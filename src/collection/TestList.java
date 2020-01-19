package collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
		c.add("我啊连锁店解放");
		c.add("阿地方法规司法规");
		System.out.println(c);
		System.out.println(c.contains("我啊连锁店解放"));
		c.remove("我啊连锁店解放");
		System.out.println(c);
		c.clear();
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
	}
}
