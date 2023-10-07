package main;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {7,8,3,1,2};
		SelectionSort s1 = new SelectionSort();
		s1.selection(arr);

	}
	public void selection(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min]>arr[j]) {
					min =j;	
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
