package Exam;

public class Rectangle {
	int height =10;
	int width=20;
	
	double ans;
	
	public Rectangle(int height, int width) {
		this.height=height;
		this.width=width;
	}
	
	public void areaRect() {
		ans = height*width;
		System.out.println("Answer: " + ans);
	}
	public void periRect() {
		ans = (height+width)*2;
		System.out.println("Answer: " + ans);
	}
	
	public static void main(String[]args) {
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.areaRect();
		rectangle.periRect();
		
	}
	
	
	
	

}
