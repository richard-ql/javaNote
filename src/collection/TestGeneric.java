package collection;

public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> c = new MyCollection<String>();
		c.set("gaoasdf", 0);
		System.out.println(c.get(0));
	}
}

class MyCollection<E>{
	Object[] o = new Object[5];
	
	public void set(E e, int index) {
		o[index] = e;
	}
	
	public E get(int index) {
		return (E)o[index];
	}
}