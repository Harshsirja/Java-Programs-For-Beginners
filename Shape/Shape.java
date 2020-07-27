abstract class Shape
{
	abstract void area();
	static final float PI=3.14f;
}
class Circle extends Shape
{
	int r;
	Circle()
	{
		r=1;
	}
	Circle(int r)
	{
		this.r=r;
	}
	void area()
	{
		float area=r*r*PI;
		System.out.println(area);
	}
}
class Rectangle extends Shape
{
	int h,w;
	Rectangle()
	{
		h=w=1;
	}
	Rectangle(int h,int w)
	{
		this.h=h;
		this.w=w;
	}
	void area()
	{
		float area=h*w;
		System.out.println(area);
	}	
}
class Triangle extends Shape
{
	int h,b;
	Triangle()
	{
		h=b=1;
	}
	Triangle(int h,int b)
	{
		this.h=h;
		this.b=b;
	}
	void area()
	{
		float area= (1f/2f) * h * b;
		System.out.println(area);
	}
}
class ShapeImplement
{
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.area();
		Circle c = new Circle();
		c.area();
		Rectangle r = new Rectangle();
		r.area();
		Triangle t1 = new Triangle(2,3);
		t1.area();
		Circle c1 = new Circle(10);
		c1.area();
		Rectangle r1 = new Rectangle(4,5);
		r1.area();

	}
}