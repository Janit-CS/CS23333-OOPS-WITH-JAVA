import java.util.*;

class Refund
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int one = ip.nextInt();
		int more = ip.nextInt();
		double c = one*0.10;
		double d = more*0.25;
		System.out.println("Your total refund will be $"+(c+d));
	}
}