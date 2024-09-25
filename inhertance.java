//1.SINGLR INHERRITANCE
class vehicle{
	void start(){
		System.out.println("Vehicle started");
	}
}
class car extends vehicle{
	void start(){
		System.out.println("Car started");
	}
}
public class Inheritance1{
	public static void main(String[] args){
		vehicle v=new vehicle();
		car c=new car();
		v.start();
		c.start();
	}
}							



//2.SINGLR INHERRITANCE
class person{
	String name;
	int age;
		
	void display(){
		System.out.println("name:"+name);
		System.out.println("age"+age);
	}
}
class employee extends person	{
	double salary;
	employee(String a,int b,double c){
		name=a;
		age=b;	
		salary=c;
	}
	void display(){
		System.out.println("name:"+name);
		System.out.println("age"+age);
		System.out.println("salary"+salary);
		
	}
}
public class Inheritance2{
	public static void main(String[] args){
		person p=new person();
		p.name="vamsi";
		p.age=18;
		p.display();
		employee e=new employee("abdul",18,50000);		
		e.display();
	}
}		
				



//3.MULTILEVEL INHERITANCE
class animal{
	void makessound(){
		System.out.println("sound");
	}
}
class dog extends animal{
	void makessound(){
		System.out.println("woof");
	}
}
class puppy extends dog{
	void makessound(){
		System.out.println("yap");
	}
}
public class Inheritance3{
	public static void main(String[] args){
		animal a=new animal();
		dog d=new dog();
		puppy p=new puppy();
		d.makessound();
		p.makessound();
		
	}
}								


//4.HIERARCHICAL INHERITANCE
import java.io.*;
abstract class shape{
	double getArea(){
	return 0;
	}
}
class rectangle extends shape{
	double width;
	double length;
	rectangle(double w,double l){
		width=w;
		length=l;
	}
	double getArea(){
		return length*width;
	}
}
class circle extends shape{
	double radius;
	circle(double r){
		radius=r;
	}
	double getArea(){
		return 3.14*radius*radius;
	}
}
public class a{
	public static void main(String[] args){
		double a,b;
		rectangle r=new rectangle(20,10);
		circle c=new circle(7);
		a=r.getArea();
		b=c.getArea();
		System.out.println("the area of rectangle is"+a);
		System.out.println("the area of circle is"+b);
	}
}	

		
