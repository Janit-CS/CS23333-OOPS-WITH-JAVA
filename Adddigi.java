import java.io.*;
import java.util.*;

class Adddigi
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int fisdig = ip.nextInt();
		int secdig = ip.nextInt();
		int fislast = fisdig % 10;
		fislast = (fislast < 0) ? -fislast : fislast;
		int seclast = secdig % 10;
		seclast = (seclast < 0) ? -seclast : seclast;
		int last = fislast + seclast;
		System.out.println(last);
	}
}