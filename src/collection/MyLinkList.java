package collection;

public class MyLinkList {
	private Node head;
	
	public static void main(String[] args) {
		MyLinkList obj = new MyLinkList();
		System.out.println(obj.isEmpty());
		System.out.println(obj.length());
		
	}
	
	MyLinkList() {
		this.head = null;
	}
	
	MyLinkList(Node node) {
		this.head = node;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int length() {
		Node cur = this.head;
		int count = 0;
		while(cur!=null) {
			count++;
			cur = cur.next;
		}
		return count;
	}
	
	public int get(int index) {
		if(index<0 || index>this.length() || this.isEmpty()) {
			return -1;
		}
		Node cur = this.head;
		int count = 0;
		while(count < index) {
			count++;
			cur = cur.next;
		}
		return cur.el;
	}
	
	public void addAtHead(int val) {
		Node node = new Node(val);
		node.next = this.head;
		this.head = node;
	}
	
	
}
