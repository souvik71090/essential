//sort an array in descending order
package main;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {4,2,1,3,5};
		printArray(arr);
		System.out.println("The new array is ");
		SortArray s1 =new SortArray();
		//s1.arraySort();
		Arrays.sort(arr);
		printArray(arr);
		//Arrays.
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}
	public void arraySort() {
		int[] arr = {4,2,1,3,5};
		int[] arr1 = new int[5];
		int n =arr.length;
		for (int i = 0; i <n; i++) {
			if (arr[i]>arr[i+1]) {
				arr1[i]=arr[i];
			} else {
				arr1[i]=arr[i+1];
			}
		}
		printArray(arr1);
	}
}