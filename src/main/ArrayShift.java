package main;

public class ArrayShift {

	public static void main(String[] args) {
		//int[] arr=new int[5];
		int[] arr= {1,2,3,4,5};
	/*	arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;*/
		ArrayShift a1=new ArrayShift();
		printArray(arr);
		System.out.println("The new array is ");
		a1.shiftArray(arr);
	}
	public static void printArray(int[] arr ) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
		public void shiftArray(int[] arr) {
			int[] arr1= new int[5];
			for (int i = 0; i < arr.length; i++) {
				arr1[(i+2)%arr.length]	=	arr[i];
					}
			printArray(arr1);
	}
}

