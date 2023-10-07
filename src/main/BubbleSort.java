package main;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {7,8,3,1,2};
		BubbleSort b1 = new BubbleSort();
		b1.bubble(arr);
	}
	public void bubble(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
