package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("aa");
		li.add("bb");
		li.add("cc");
		
		List<String> lia = new ArrayList<>();
		lia.add("aa");
		lia.add("dd");
		lia.add("ee");
		
		li.addAll(lia);
		System.out.println(li);
		
//		li.removeAll(lia);
//		System.out.println(li);
//		System.out.println(lia);
		
		li.retainAll(lia);
		System.out.println(li);
		System.out.println(lia);
		
		System.out.println(li.contains(lia));
		
	}
}
