//Write a program to reverse an array

package main;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		printArray(arr);
		ReverseArray r1= new ReverseArray();
		System.out.println("The reversed array is ");
		r1.arrayReverse(arr);
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
}
	public void arrayReverse(int[] arr) {
		int[] arr1= new int[5];
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			arr1[n-(i+1)]=arr[i];
				}
		printArray(arr1);
}
	
	}
