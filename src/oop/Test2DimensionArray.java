package oop;

public class Test2DimensionArray {
	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[] {1, 2, 3};
		a[1] = new int[] {4, 5, 6};
		a[2] = new int[] {7,8,9};
		
		System.out.println(a[1][2]);
		
		int[][] b = {
				{10, 20},
				{20,30},
				{30,40}
		};
		System.out.println(b[1][1]);
	}
}
