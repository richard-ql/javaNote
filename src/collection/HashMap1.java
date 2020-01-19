package collection;

public class HashMap1<K, V> {
	Node2[] table; //bucker位桶
	int size; //HashMap的大小
	
	public HashMap1() {
		table = new Node2[16];
		
	}
	
	public static void main(String[] args) {
		HashMap1<Integer, String> m = new HashMap1<>();
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		m.put(20, "ssss");
		
		m.put(53, "gg");
		m.put(69, "hh");
		m.put(85, "kk");
		
		System.out.println(m);
		System.out.println(m.get(69));
		System.out.println(m.size);
	}
	
	public void put(K key, V value) {
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		Node2 lastNode = new Node2();
		boolean keyRepeat = false;
		
		if(temp==null) {
			table[newNode.hash] = newNode;
			size++;
		}else {
			//数组不为空，继续遍历链表
			while(temp!=null) {
				//判断如果key重复，则覆盖
				if(temp.key.equals(newNode.key)) {
					keyRepeat = true;
					temp.value = newNode.value;
					break;
				}else {
					lastNode = temp;
					temp = temp.next;
				}
			}
			if(!keyRepeat) {
				lastNode.next = newNode;
				size++;
			}
		}
	}
	
	public V get(K key) {
		int hash = myHash(key.hashCode(), table.length);
		V value = null;
		
		Node2 temp = table[hash];
		if(temp!=null) {
			while(temp!=null) {
				if(temp.key.equals(key)) {
					return (V)temp.value;
				}else {
					temp = temp.next;
				}
			}
			
		}
		return value;
	}
	
	public int myHash(int v, int length) {
//		System.out.println("hash in myHash:" + (v&(length-1)));
//		System.out.println("hash in myHash:" + (v%(length-1)));
		return v&(length-1);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for(int i=0;i<table.length;i++) {
			Node2 temp = table[i];
			while(temp!=null) {
				sb.append(temp.key + ":"+temp.value+",");
				temp = temp.next;
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		return sb.toString();
	}
}
