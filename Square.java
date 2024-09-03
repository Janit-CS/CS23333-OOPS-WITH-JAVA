import java.util.*;

class Square
{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int fr = 0;
        int[] f = new int[n];
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = ip.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            int temp = arr[i];
            while ( temp != 0) {
                fr = temp % 10;
                temp /= 10;
            }
            f[i] = fr * fr;
        }
        for(int i = 0; i < n; i++)
        {
            sum += f[i];
        }
        System.out.println(sum);
    }
}