
package constructor;

class Rectangle {
	int length; // instance variables
	int width;

	Rectangle(int A, int B) // making a constructor
	{
		length = A;
		width = B;
	}

	public void area() {
		int area;
		area = length * width;
		System.out.println(area);

	}
}

public class constructor {
	public static void main(String args[]) {

		Rectangle rect1 = new Rectangle(5, 5); // initialise values while declaring.

		rect1.area();

	}

}