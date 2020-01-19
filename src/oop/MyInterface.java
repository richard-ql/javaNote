package oop;
/*
 * 接口详细说明：
 * 1. 访问修饰符只能是public 或 默认
 * 2. 接口命名和类命名一致
 * 3. extends 可以多继承
 * 4. 接口属性只能是常量，默认为 public static final
 * 5. 接口方法 默认为public abstract
 */
public interface MyInterface {
	/*默认会添加public static final*/ int AGE = 10;
	/*默认会添加public abstract*/ void test01();
}

class MyClass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(AGE);
		System.out.println("MyClass.test01()");
	}
	
}
