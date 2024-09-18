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
