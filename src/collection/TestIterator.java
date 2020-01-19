package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {
	public static void main(String[] args) {
		testIteratorList();
	}
	
	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("ab");
		list.add("ac");
		list.add("ad");
		
		for(Iterator<String> iter=list.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
		//HashMap��һ�ֵ�����ʽ
		Map<Integer, String> mp1 = new HashMap<>();
		mp1.put(10, "����");
		mp1.put(20, "����");
		mp1.put(5, "����");
		mp1.put(6, "����");
		
		//entrySet ������python dict.items()
		Set<Entry<Integer,String>> mapSet1 = mp1.entrySet();
		
		for(Iterator<Entry<Integer,String>> iter=mapSet1.iterator();iter.hasNext();) {
			System.out.println(iter.next());
		}
		
		//HashMap�ڶ��ֵ�����ʽ
		Map<Integer, String> mp2 = new HashMap<>();
		mp2.put(10, "����1");
		mp2.put(20, "����2");
		mp2.put(5, "����3");
		mp2.put(6, "����4");
		
		//keySet ������python dict.keys()
		Set<Integer> mapSet2 = mp2.keySet();
		for(Iterator<Integer> iter1=mapSet2.iterator();iter1.hasNext();) {
			Integer key = iter1.next();
			String value = mp2.get(key);
			System.out.println(key+":"+value);
		}
		
		
	}
}
