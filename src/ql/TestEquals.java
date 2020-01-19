package ql;

public class TestEquals {
	Object obj;
	String str;
	public static void main(String[] args) {
		Person1 p1 = new Person1(100, "a");
		Person1 p2 = new Person1(100, "b");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
	}
}

class Person1{
	int id;
	String name;
	
	public Person1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
