import java.util.*;

class Desc
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int des = ip.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = ip.nextInt();
        }
        for(int i = des-1; i < n; i+=3)
        {
            if( arr[i] > arr[i-1] && arr[i] > arr[i-2])
            {
                if(arr[i-1] > arr[i-2]) {
                    res[i] = arr[i];
                    res[i + 1] = arr[i - 1];
                    res[i + 2] = arr[i - 2];
                }
                else
                {
                    res[i] = arr[i];
                    res[i + 1] = arr[i - 2];
                    res[i + 2] = arr[i - 1];
                }
            }
            if( arr[i-1] > arr[i] && arr[i-1] > arr[i-2])
            {
                if(arr[i] > arr[i-2]) {
                    res[i] = arr[i-1];
                    res[i + 1] = arr[i];
                    res[i + 2] = arr[i - 2];
                }
                else
                {
                    res[i] = arr[i-1];
                    res[i + 1] = arr[i - 2];
                    res[i + 2] = arr[i];
                }
            }
            if( arr[i-2] > arr[i-1] && arr[i-2] > arr[i])
            {
                if(arr[i-1] > arr[i]) {
                    res[i] = arr[i-2];
                    res[i + 1] = arr[i - 1];
                    res[i + 2] = arr[i];
                }   
                else
                {
                    res[i] = arr[i-2];
                    res[i + 1] = arr[i];
                    res[i + 2] = arr[i - 1];
                }
            }
        }
    }
}