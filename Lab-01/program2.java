abstract class Shape
{
    int x;
    int y;
    abstract void printArea();
}

class Rectangle extends Shape
{
    int area;    
    Rectangle() { }

    Rectangle(int length, int breadth)
    {
        area = length * breadth;
    }

    public void printArea()
    {
        System.out.println("Area of Rectangle: " +area);
    }
}

class Triangle
{
    double area;    
    Triangle() { }

    Triangle(int base, int height)
    {
        area = 0.5 * base * height;
    }

    public void printArea()
    {
        System.out.println("Area of Triangle: " +area);
    }
}

class Circle
{
    double area;
    
    Circle() { }

    Circle(int radius)
    {
        area = 3.142 * radius * radius;
    }

    public void printArea()
    {
        System.out.println("Area of Circle: " +area);
    }
}

class program2 
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(10, 20);
        r.printArea();

        Triangle t = new Triangle(5,6);
        t.printArea();

        Circle c = new Circle(5);
        c.printArea();
    }
}