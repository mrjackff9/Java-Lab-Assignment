class rectangle{
  double l;
  double b;
	void input(){
	l=5;
	b=7;
	}
	void area()
	{
	System.out.println("Area of Rectangle is "+l*b);
	}
	void perimeter()
	{
	System.out.println("Perimeter of Rectangle is "+2*(l+b));
	}
  public static void main(String[]args){
    rectangle re=new rectangle();
    re.input();
    re.area();
    re.perimeter();
  }
}