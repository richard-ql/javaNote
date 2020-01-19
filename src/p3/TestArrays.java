package p3;

public class TestArrays {
	public static void main(String[] args) {
		int[] arr01 = new int[10];
		String[] arr02 = new String[20];
		User[] arr03 = new User[3];
		
		for(int i=0; i<(arr01.length);i++) {
			arr01[i] = i;
		}
		for(int i=0; i<arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
		arr03[0] = new User(100, "yi");
		arr03[1] = new User(101, "er");
		arr03[2] = new User(102, "san");
		
		for(int i=0; i<arr03.length; i++) {
			System.out.println(arr03[i].getName());
		}
	}
}


class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}