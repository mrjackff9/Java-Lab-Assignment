import java.util.*;
class circle
	{
	public double radius;
	void input()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius:");
	radius=sc.nextDouble();
	}
	void area()
	{
	System.out.println("Area of Circle is "+3.14*radius*radius);
	}
	void perimeter()
	{
	System.out.println("Perimeter of circle is "+2*3.14*radius);
	}
	public static void main(String []args)
	{
	circle c=new circle();
	c.input();
	c.area();
	c.perimeter();
	}
}