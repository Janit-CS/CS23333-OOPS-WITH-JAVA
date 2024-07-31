import java.io.*;
import java.util.*;

class Odd
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int res = (num%2!=0)? 2 : 1 ;
		System.out.println(res);
	}
}