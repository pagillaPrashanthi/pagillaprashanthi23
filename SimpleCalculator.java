package calculator;

 import java.util.Scanner;

public class SimpleCalculator
{
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	
	public int subtract(int a, int b)
	{
		int c = a-b;
		return c;
	}
	
	public int multiply(int a, int b)
	{
		int c = a*b;
		return c;
		
	}
	
	public int divide(int a, int b)
	{
		int c = a/b;
		return c;
	}

public static void main(String[] args)
{
	int a;
	int b; 
	String choice;
	
	
	Scanner scanner = new Scanner(System.in);
	SimpleCalculator cal = new SimpleCalculator();
	
	
	System.out.println("enter two numbers: ");
	a = scanner.nextInt();
	b = scanner.nextInt();
	
	
System.out.println("enter your operation: ");
choice = scanner.next();

if(choice.equals("+"))
{
	int c = cal.add(a, b);
	System.out.println("Addition is:" + c);
}
else if(choice.contentEquals("-"))
{
	int c = cal.subtract(a, b);
	System.out.println("Subtraction is: " + c);
}
else if(choice.equals("*"))
{
	int c = cal.multiply(a, b);
	System.out.println("Multiplication is:" + c);
}
else if(choice.equals("/"))
{
	try
	{ 
		int c = cal.divide(a, b);
		System.out.println("Division is: " + c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("no division");
	}
}
else
	System.out.println("Invalid choice");
}

}
