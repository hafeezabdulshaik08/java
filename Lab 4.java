abstract class shape
{
    abstract double area();
}

class circle extends shape
{
    double radius;
    public circle(double radius)
    {
        this.radius = radius;
    }
    double area()
    {
        return Math.PI * radius * radius;
    }
}
class rectangle extends shape
{
    double length,breadth;
    public rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double area()
    {
        return length * breadth;
    }
}

class triangle extends shape
{
    double base,height;
    public triangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }

    double area()
    {
        return 0.5 * base * height;
    }
}

public class abstractc
{
    public static void main(String [] args)
    {
        shape circle = new circle(5);
        shape rectangle = new rectangle(4,5);
        shape triangle = new triangle(8,4);
        System.out.println("area of the circle is  " + circle.area());
        System.out.println("area of the rectangle is  " + rectangle.area());
        System.out.println("area of the triangle is  " + triangle.area());


        

    }
}

//2
import java.lang.Math;
class calc
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a , int b)
    {
        return a-b;
    }
    
}
class advcalc extends calc
{
    public int mult(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}

class scical extends advcalc
{
    public double power(int a,int b)
    {
        return Math.pow(a,b);
    }
}

public class minheritence
{
    public static void main(String [] args)
    {
        scical mycal = new scical();
        int r1 = mycal.add(3,5);
        int r2 = mycal.sub(10,2);
        int r3 = mycal.mult(4,5);
        int r4 = mycal.div(9,3);
        double r5 = mycal.power(2,3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5) ;
    }
}

//3
class calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }

}

class advcalculator extends calculator
{
    public int mult(int a, int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
public class sinheritence
{
    public static void main(String[] args)
    {
        advcalculator calc = new advcalculator();
        int r1 = calc.add(2,5);
        int r2 = calc.sub(8,1);
        int r3 = calc.mult(5,8);
        int r4 = calc.div(9,3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
