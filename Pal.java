import java.util.*;

class Pal
{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a=ip.nextInt();
        int temp =a;
        int rev=0;
        while(temp > 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == a)
        {
            System.out.println("The Reversed number is " + rev + ".It is Same as the original number.");
        }
        else
        {
            System.out.println("The Reversed number is " + rev + ".It is Not Same as the original number.");
        }
    }
}