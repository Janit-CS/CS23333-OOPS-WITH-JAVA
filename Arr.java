import java.util.*;

class Arr
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = ip.nextInt();
        }
        int m = ip.nextInt();
        for(int i = 0; i < n; i++)
        {
            while(arr[i] == m)
            {
                m = m * 2;
            }
        }
        System.out.println(m);
    }
}