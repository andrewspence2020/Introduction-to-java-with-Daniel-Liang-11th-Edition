package Java_homework;

import java.awt.Rectangle;

public class java_homework_page362Q9_1 {

	public static void main(String[] args) {
		//UML DIagram with Also code to Calculate 2 rectangles


class Rectangle {
double width;	// Width of rectangle
double height;	// Height of rectangle


@SuppressWarnings("unused")
Rectangle() {
	width = 1;
	height = 1;
} 


Rectangle(double newWidth, double newHeight) {
	width = newWidth;
	height = newHeight;
}


double getArea() {
	return width * height; 
}

double getPerimeter() {
	return 2 * (width + height);
}
}
		// Create a Rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);

		// Create a Rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());


		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
		
        //UML Class Diagram                     
/**************************************************
*               Rectangle                         *  
* ------------------------------------------------*  
* width: double                                   *
* height: double                                  * 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double                          *
***************************************************/
		
		

	}

}
