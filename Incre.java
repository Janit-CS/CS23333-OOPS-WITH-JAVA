import java.util.*;

class Incre
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int salary = ip.nextInt();
        double pi = ip.nextDouble();
        double incsal = (salary * pi)/100;
        double totsal = salary+incsal;
        System.out.println("The Increased Salary : " + totsal);
    }
}