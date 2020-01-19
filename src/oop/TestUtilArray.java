package oop;

import java.util.Arrays;

public class TestUtilArray {
	public static void main(String[] args) {
		int[] a = {100, 20, 30, 10, 5, 600};
//		System.out.println(a);
//		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 30));
	}
}
