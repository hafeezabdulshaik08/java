interface animal
{
    void display();
}
class dog implements animal
{
    String animal;
    String breed;
    public dog(String animal,String breed)
    {
        this.animal = animal;
        this.breed = breed;

    }
    public void display()
    {
        System.out.println("NAME OF THE ANIMAL IS " + animal);
        System.out.println("NAME OF THE BREED IS " + breed);

    }
}
public class interf
{
    public static void main(String [] args)
    {
        dog mydog = new dog("hammy","german shepherd");
        mydog.display();
    }
}

//2
class animal
{
    void sound()
    {
        System.out.println("the animal makes sound");
    }
}
class dog extends animal
{
    void sound()
        {
            System.out.println("the dog barks");
        }
    
}
class cat extends animal
{
    void sound()
    {
        System.out.println("cat meows");
    }
}
public class polymorphism
{
    public static void main(String [] args)
    {
        animal myanimal;

        dog mydog = new dog();
        cat mycat = new cat();
        animal.sound();
        mydog.sound();
        mycat.sound();

    }
}

//3

class animal
{
    String name;
    public animal(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println("animal name " + name);
    }
    
}
class dog extends animal
{
    String breed;
    dog(String name,String breed)
    {
        super(name);
        this.breed = breed;
        
    }
    void display()
    {
        super.display();
        System.out.println("dog breed " + breed);
    }
}

public class superexample
{
    public static void main(String [] args)
    {
        dog mydog = new dog("jimmy","corgi");
        
        mydog.display();
    }
}
