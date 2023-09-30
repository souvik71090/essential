package main;

public class Area {

	public static void main(String[] args) {
		
		Area a1 = new Area();
		a1.calculateArea(20, 10);
	}


	public void calculateArea(int length, int width) {
		int area=length*width;
		System.out.println(area);
	}
}
