package oop;
/*
 * �ӿ���ϸ˵����
 * 1. �������η�ֻ����public �� Ĭ��
 * 2. �ӿ�������������һ��
 * 3. extends ���Զ�̳�
 * 4. �ӿ�����ֻ���ǳ�����Ĭ��Ϊ public static final
 * 5. �ӿڷ��� Ĭ��Ϊpublic abstract
 */
public interface MyInterface {
	/*Ĭ�ϻ����public static final*/ int AGE = 10;
	/*Ĭ�ϻ����public abstract*/ void test01();
}

class MyClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(AGE);
		System.out.println("MyClass.test01()");
	}
	
}
