import java.util.*;

class Dollars
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        double cents = ip.nextDouble();
        double dollar = cents/100;
        System.out.printf("Dollar : %.2f",dollar);
    }
}