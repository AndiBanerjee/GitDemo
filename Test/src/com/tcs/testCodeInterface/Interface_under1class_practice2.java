package com.tcs.testCodeInterface;
/*Interface method getArea() is used in different classes*/
interface Shape{
	void getArea(double a,double b);
}
class Rectangle implements Shape{
	double Area;
	@Override
	public void getArea(double length,double width) {
		Area=length*width;
		}
	public String toString() {
		return "\n The area of Rectangle is :"+Area;
		
	}
}
class Circle implements Shape{
	double Area;
	public void getArea(double radius,double nothing) {
		Area=( 3.14*(radius*radius));
		}
	public String toString() {
		return "\n The area of Circle is :"+Area;
		
	}
}
class Triangle implements Shape{
	double Area;
	public void getArea(double height,double base) {
		Area=(height*base)/2;
		}
	public String toString() {
		return "\n The area of Triangle is :"+Area;
		
	}
}

class Main {
   
    
    public static void main(String args[])
    {
        System.out.println("Inside main");
    	Rectangle R=new Rectangle();
    	R.getArea(23.3,45.6);
    	System.out.println(R.toString());
    	Circle C=new Circle();
    	C.getArea(78.6, 0);
    	System.out.println(C.toString());
    	Triangle T=new Triangle();
    	T.getArea(45.6,89.9);
    	System.out.println(T.toString());
    	
    	
        
    }
}
