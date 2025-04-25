package operators;

public class calculator {
	void add(int a,int b)
	{
		System.out.println("The sum is"+(a+b));
	}
	void show()
	{
		System.out.println("This is inheritance");
	}

}
class scientific extends calculator
{
	void sineCosine(int angle)
	{
		System.out.println("This is a angle");
	}
}
