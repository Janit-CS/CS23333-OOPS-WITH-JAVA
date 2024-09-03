import java.util.*;

class Strong
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int sum = 0;
        int a = n;
        int temp = 0;
        while(n != 0 )
        {
            int fact = 1;
            temp = n % 10;
            for(int i = temp; i > 0; i--)
            {
                fact *= i;
            }
            sum+=fact;
            n/=10;
        }
        if(a == sum)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not a strong number");
        }
    }
}