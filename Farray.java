import java.util.*;

class Farray
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner (System.in);
		int[] arr = new int[10];
		for (int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = ip.nextInt();
		}
		System.out.println(" ");
		for(int i : arr)
		{ 
			System.out.println(i);  
		}
	}
}