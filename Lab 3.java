import java.util.Scanner;
class car1
{
	String name;
	int model;
	
	car1(String a,int b)
	{
		name = a;
		model = b;
	}
	void display()
	{
		System.out.println("the name of the car is " +name);
		System.out.println("the model of the car is " + model);
	}
}

public class car
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the car");
		String name = sc.nextLine();
		System.out.println("enter the model number");
		int number = sc.nextInt();
		car1 mycar = new car1(name,number);
		mycar.display();

	}
}


import java.util.Scanner;
public class constructor
{
	public static void main(String[] args)
	{
		System.out.println("enter the name of bike");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("enter the model of the bike");
		String model = sc.nextLine();
		bike mybike = new bike(name,model);
		mybike.display();
		
		
	}
}

class bike
{
	String bikename,bikemodel;
	bike(String name,String model)
	{
		bikename = name;
		bikemodel = model;
	}
	
	void display()
	{
		System.out.println("the name of the bike " + bikename);
		System.out.println("the model of the bike "+ bikemodel);
	}
}



//3

class dog
{
    String name;
    String breed;
    int age;
    public dog(String name)
    {
        this.name = name;
    }
    public dog(String name,String breed)
    {
        this.name = name;
        this.breed = breed;
    }
    public dog(String name,String breed,int age)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void display()
    {
        System.out.println("name :" + name + ",breed :" + breed + ",age :" + age);
    }


}
public class constructoroverloading
{
    public static void main(String [] args)
    {
        dog dog1 = new dog("snoopy");
        dog dog2 = new dog("max","golden retriever");
        dog dog3 = new dog("mark","chihuahua",4);

        dog1.display();
        dog2.display();
        dog3.display();

    }
}

//4
public class methodoverloading
{
	public static void main(String [] args)
	{
		sum s1 = new sum();
		s1.sum(2,5);
		s1.sum(4,5,7);
		
	} 
}

class sum
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
