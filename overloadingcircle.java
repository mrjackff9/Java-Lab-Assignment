import java.util.*;
class overloadingcircle
	{
	private double radius;
	void input()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius:");
	radius=sc.nextDouble();
	}
	void input(double r)
	{
	radius=r;
	}
	void area()
	{
	System.out.println("Area of Circle is "+3.14*radius*radius);
	}

	void area(double r)
	{
	System.out.println("Area of Circle is "+3.14*r*r);
	}
	public static void main(String []args)
	{
	circle c=new circle();
	c.input();
	c.area();  
	overloadingcircle b=new overloadingcircle();
	b.area(7.8);
	overloadingcircle d=new overloadingcircle();
	d.input(4);
	d.area();
	}
}