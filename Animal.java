package operators;

public class Animal {
	String name;
	String color;
	void eat()
	{
		System.out.println("The animal eats");
	}

}
class harbivorous extends Animal 
{
	void eat()
	{
		System.out.println("Eats grass");
	}
}
