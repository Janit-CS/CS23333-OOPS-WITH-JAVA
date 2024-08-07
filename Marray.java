import java.util.*;

class Marray
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner (System.in);
		int[][] arr = new int[5][5];
		for (int i = 0 ; i < 5 ; i++)
		{
			for (int j = 0 ; j < 5 ; j++ )
			{
				arr[i][j] = ip.nextInt();
			}
		}
		System.out.println(" ");
		for (int i = 0 ; i < 5 ; i++)
		{
			for (int j = 0 ; j < 5 ; j++ )
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}