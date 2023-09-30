package main;

public class MaxElement {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		MaxElement m1=new MaxElement();
		int d=m1.maxElement(arr);
		printArray(arr);
		
		System.out.println("The max element is "+d);
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public int maxElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
