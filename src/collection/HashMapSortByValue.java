package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByValue {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("a", "bbbb");
		map.put("c", "aaaa");
		map.put("b", "dddd");
		map.put("d", "cccc");
		
		//HashMap∞¥÷µ≈≈–Ú
		List<Map.Entry<String,String>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			public int compare(Map.Entry<String, String> o1,
					Map.Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry<String,String> map1: list) {
			System.out.println(map1.getKey()+":"+map1.getValue());
		}
		
		//HashMap∞¥key≈≈–Ú
		Map<String,String> map2 = new TreeMap<String, String>(
			new Comparator<String>() {
				public int compare(String obj1, String obj2){
					return obj1.compareTo(obj2);
				}
		});
		map2.put("a", "bbbb");
		map2.put("c", "aaaa");
		map2.put("b", "dddd");
		map2.put("d", "cccc");
		
		Set<String> keySet = map2.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + ":" + map2.get(key));
        }
	}
}
