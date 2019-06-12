package project23th;
class  vehicle
{
	void func()
	{
	System.out.println("My ancestor is a cycle who is a vehicle with pedals.");

	}
}
class  Motorcycle extends vehicle
{
	void func()
	{
		
	System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
	super.func();
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Motorcycle ob=new Motorcycle();
       ob.func();
	}

}
