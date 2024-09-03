import java.util.*;

class LM
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int temp = n;
        int lar = 0;
        int small = n;
        int dig = 0;
        while(temp > 0)
        {
            dig = temp % 10;
            if(dig > lar)
            {
                lar = dig;
            }
            if(dig < small)
            {
                small = dig;
            }
            temp /= 10;
        }
        System.out.println("The Largest Number is "+lar);
        System.out.println("The Smallest Number is "+small);
    }
}