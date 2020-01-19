package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		Map<Integer, String> treeMap1 = new TreeMap<>();
		treeMap1.put(20, "aa");
		treeMap1.put(3, "bb");
		treeMap1.put(6, "cc");
		// treeMap 按key自增的方式排序
		for(Integer m: treeMap1.keySet()) {
			System.out.println(m+":"+treeMap1.get(m));
		}
		
		Map<Emp, String> treeMap2 = new TreeMap<>();
		treeMap2.put(new Emp(10, "张三", 10000), "老板好像脑袋有坑，但是张三不说");
		treeMap2.put(new Emp(5, "李四", 3000), "老板我是你爸爸");
		treeMap2.put(new Emp(20, "王五", 80000), "我不需要下班");
		treeMap2.put(new Emp(9, "赵六", 10000), "给钱就行，别的不关心");
		
		System.out.println(treeMap2);
	}
}

class Emp implements Comparable<Emp> {
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "(id: " + this.id + "name: " + this.name + "salary: " + this.salary + ")";
	}
	
	@Override
	public int compareTo(Emp o) {    //负数、小于，零、等于，正数、大于
		if(this.salary > o.salary) {
			return 1;
		}else if(this.salary < o.salary) {
			return -1;
		}else {
			if(this.id > o.id) {
				return 1;
			}else if(this.id < o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
