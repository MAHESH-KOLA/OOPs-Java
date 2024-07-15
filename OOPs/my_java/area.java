import java.util.*;

class Rectangle {

	int length;
	int width;
	
	Rectangle(int a, int b){
	length=a;
	width=b;
	}
	
	void Area()
	{
		double area;
		area = length * width;
		System.out.println("Area of rectangle is : "
						+ area);
	}

	void Perimeter()
	{
		double perimeter;
		perimeter = 2 * (this.length + this.width);
		System.out.println("Perimeter of rectangle is : "
						+ perimeter);
	}
}

class area {
	
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle(5,3);
		
		System.out.println("Length = " + rect.length);
		System.out.println("Width = " + rect.width);
		
		rect.Area();
		rect.Perimeter();
	}
}

