package p3;

public class TestArrays2 {
	public static void main(String[] args) {
		//���龲̬��ʼ��
		int[] arr01 = {1, 2, 3};
		User[] arr03 = {new User(100, "gaoqi"), new User(101, "gaoer")};
		
		//Ĭ�ϳ�ʼ������ʼ��ֵ�ͳ�Ա������ʼ��ֵ����һ��
		int[] arr04;
		String[] arr05;
		
		//��̬��ʼ��
		
		// forEach
		for(int m: arr01) {
			System.out.println(m);
		}
		
	}
}
