package oop;

import java.util.Arrays;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		for(int i=0;i<values.length-1;i++) {
			for(int j=0;j<values.length-1-i; j++) {
				if(values[j]>values[j+1]) {
					int temp;
					temp = values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(values));
	}
}
