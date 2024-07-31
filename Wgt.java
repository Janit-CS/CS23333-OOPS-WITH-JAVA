import java.io.*;
import java.util.*;

class Wgt
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner (System.in);
		int wid = ip.nextInt();
		int giz = ip.nextInt();
		double tot = (wid * 75)+(giz * 112);
		System.out.println("Total Weight : " + tot);
	}
}