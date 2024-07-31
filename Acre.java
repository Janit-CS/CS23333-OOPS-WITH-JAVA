import java.io.*;
import java.util.*;

class Acre
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner (System.in);
		int l = ip.nextInt();
		int b = ip.nextInt();
		float res = (l*b)/43560;
		System.out.println("The Size of Acre : " + res);
	}
}