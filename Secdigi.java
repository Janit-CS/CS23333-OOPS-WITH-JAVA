import java.util.*;

class Secdigi
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int sl=0;
		if(num >= 10 || num <=-10){
			sl = (num / 10) % 10;
			sl = (sl < 0) ? -sl : sl;
		}
		else{
			sl=-1;
		}
		System.out.println(sl);
	}
}
