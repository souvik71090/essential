package main;

public class Area {

	public static void main(String[] args) {
		int length=10;
		int width=20;
		Area a1 = new Area();
		a1.calculateArea(length, width);
	}


	public void calculateArea(int length, int width) {
		int area=length*width;
		System.out.println(area);
	}
}
