package main;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
		String s="My full name is Souvik Datta and this is begining ";
		WordCount w1=new WordCount();
		w1.findCount(s);
	}
	
	public void findCount(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] arr=s.toUpperCase().split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
}
		for (String s1: map.keySet()) {
			if (map.get(s1)>1) {
				System.out.println(s1 + " " + map.get(s1));
			}
			
		}
}
	}