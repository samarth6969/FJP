import java.util.*;
public class Rectangle {
	
	double lenght;
	double width;
	double area;
	String colour;
	
	void get_length(){
		Scanner obj = new Scanner(System.in);
		lenght = obj.nextInt();
	}
	void get_width(){
		Scanner obj = new Scanner(System.in);
		width = obj.nextInt();
	}
	String get_colour(){
		Scanner obj = new Scanner(System.in);
		colour = obj.nextLine();
		return colour;
	}
	double find_area(){
		area = lenght*width;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		System.out.println("Roll No: 32358");
		System.out.println("Name: Om Shinde");
		System.out.println("Batch: M7\n");
		
		double area1, area2;
		String colour1, colour2;
		
		System.out.println("ENter length for rectangle 1: ");
		rect1.get_length();
		System.out.println("ENter width for rectangle 1: ");
		rect1.get_width();
		System.out.println("ENter colour of rectangle 1: ");
		colour1 = rect1.get_colour();
		area1 = rect1.find_area();
		
		System.out.println("ENter length for rectangle 2: ");
		rect2.get_length();
		System.out.println("ENter width for rectangle 2: ");
		rect2.get_width();
		System.out.println("ENter colour of rectangle 2: ");
		colour2 = rect2.get_colour();
		area2 = rect2.find_area();
		
		boolean colour_type = colour1.equalsIgnoreCase(colour2);
		
		if (area1 == area2) {
			if (colour_type == true) {
				System.out.println("Matching Rectangles.");
			}
			else {
				System.out.println("Non-Matching Rectangles. Area or colour does not match.");
			}
		}
		else {
			System.out.println("Non-Matching Rectangles. Area or colour does not match.");
		}
	}
}
