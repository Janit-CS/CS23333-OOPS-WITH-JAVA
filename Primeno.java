import java.util.*;

class Primeno
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        int[] pn = new int[n];
        int fl = 1,max = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = ip.nextInt();
            for(int j = arr[i]; j < 1; j--){
                if(arr[i]%j == 0) {
                    fl = 0;
                }
            }
            if(fl == 1) {
                pn[i] = arr[i];
                max = (max < pn[i]) ? max : pn[i];
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += pn[i];
        }
        sum -= max;
        System.out.println(sum);
    }
}