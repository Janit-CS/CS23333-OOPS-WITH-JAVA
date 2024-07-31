import java.util.*;

class Year
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int tot = ip.nextInt();
		int yy = tot / 365;
		int mm = (tot % 365) / 12;
		int dd = (tot % 365) % 7;
		System.out.println("YEARS: "+ yy +" MONTH: "+ mm +" DAYS: "+ dd);
	}
}