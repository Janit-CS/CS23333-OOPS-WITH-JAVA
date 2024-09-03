import java.util.*;

class Min
{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = ip.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        while (min != 0) {
            sum += min % 10;
            min /= 10;
        }
        if(sum % 2 == 0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}