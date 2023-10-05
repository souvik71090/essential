package main;

import java.util.HashMap;

public class StringCount {

	public static void main(String[] args) {
		
		String s1="Vivek";
		StringCount s= new StringCount();
		s.findCount(s1);
		}
	public void findCount(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] arr = s.toUpperCase().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
			
		}
		for (Character c : map.keySet()) {
			if (map.get(c)>1) {
				System.out.println(c + " " + map.get(c));
			}
			
		}
	}
	
}
