import java.io.*;
import java.util.*;

class Digi
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int dig = ip.nextInt();
		int last = dig % 10;
		last = (last < 0) ? -last : last;
		System.out.println(last);
	}
}