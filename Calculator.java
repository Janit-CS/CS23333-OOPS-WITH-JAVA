import java.io.*;
import java.util.*;

class Add
{
	void Sum(int a , int b)
	{
		int c = a + b ;
		System.out.println("The Sum of "+ a +"  and "+ b +" : "+ c);
	}
}
class Sub
{
	void Diff(int a , int b)
	{
		int c = a - b;
		System.out.println("The Difference of "+ a +"  and "+ b +" : "+ c);
	}
}
class Mul
{
	void Pro(int a, int b)
	{
		int c = a * b;
		System.out.println("The Product of "+ a +"  and "+ b +" : "+ c);
	}
}
class Div
{
	void By(int a , int b)
	{
		int c = a / b;
		System.out.println("The Division of "+ a +"  and "+ b +" : "+ c);
	}
}
class Mod
{
	void Modu(int a, int b)
	{
		int c = a % b;
        System.out.println("The Modulus of "+ a +"  and "+ b +" : "+ c);
	}
}
class Calculator
{
	public static void main(String args[])
	{
		boolean cond = true;
		Scanner ip = new Scanner(System.in);
		while(cond)
		{
			System.out.println("Enter a number : ");
			int a = ip.nextInt();
			System.out.println("Enter another number : ");
			int b = ip.nextInt();
			Add obj1 = new Add();
			Sub obj2 = new Sub();
			Mul obj3 = new Mul();
			Div obj4 = new Div();
			Mod obj5 = new Mod();
			System.out.println(" ");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			System.out.println(" ");
			System.out.println("Enter your choice : ");
			int ch = ip.nextInt();
			System.out.println(" ");
			switch(ch)
			{
				case 1:
					obj1.Sum(a,b);
					break;
				case 2:
					obj2.Diff(a,b);
					break;
				case 3:
					obj3.Pro(a,b);
					break;
				case 4:
					obj4.By(a,b);
					break;
				case 5:
					obj5.Modu(a,b);
					break;
				default:
					System.out.println("Invalid choice!");
					break;
			}
			System.out.println(" ");
			System.out.println("Do you Want to Continue??? (Y/N) :  ");
			String str = ip.next();
			if(str.equalsIgnoreCase("Y"))
			{
				cond = true;
			}
			else
			{
				cond = false;
                System.out.println("Exiting...");
                System.exit(0);
			}
		}
	}
}