package main;

public class ReverseString {

	public static void main(String[] args) {
		String s1="This is begining";
		char[] arr=s1.toCharArray();
		
		//System.out.println(arr[0]);
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}

	}

}
