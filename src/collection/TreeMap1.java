package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		Map<Integer, String> treeMap1 = new TreeMap<>();
		treeMap1.put(20, "aa");
		treeMap1.put(3, "bb");
		treeMap1.put(6, "cc");
		// treeMap ��key�����ķ�ʽ����
		for(Integer m: treeMap1.keySet()) {
			System.out.println(m+":"+treeMap1.get(m));
		}
		
		Map<Emp, String> treeMap2 = new TreeMap<>();
		treeMap2.put(new Emp(10, "����", 10000), "�ϰ�����Դ��пӣ�����������˵");
		treeMap2.put(new Emp(5, "����", 3000), "�ϰ�������ְ�");
		treeMap2.put(new Emp(20, "����", 80000), "�Ҳ���Ҫ�°�");
		treeMap2.put(new Emp(9, "����", 10000), "��Ǯ���У���Ĳ�����");
		
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
	public int compareTo(Emp o) {    //������С�ڣ��㡢���ڣ�����������
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
