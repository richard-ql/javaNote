package p3;

public class TestArrays2 {
	public static void main(String[] args) {
		//数组静态初始化
		int[] arr01 = {1, 2, 3};
		User[] arr03 = {new User(100, "gaoqi"), new User(101, "gaoer")};
		
		//默认初始化，初始化值和成员变量初始化值规则一致
		int[] arr04;
		String[] arr05;
		
		//动态初始化
		
		// forEach
		for(int m: arr01) {
			System.out.println(m);
		}
		
	}
}
