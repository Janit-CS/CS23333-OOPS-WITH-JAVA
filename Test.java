import java.util.*;

class Test
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int nhw, nww, ot;
        double hw , sal = 0;
        hw = ip.nextDouble();
        nhw = ip.nextInt();
        nww = ip.nextInt();
        if(nhw > 40)
        {
            ot = nhw-40;
            sal += (1.5 * ot * nww)+(hw * (nhw-ot) * nww);
        }
        else if(nhw < 20)
        {
            sal = hw * nhw * nww;
            sal = sal - ((10/100) * sal);
        }
        else if (nhw < 40 && nhw > 20)
        {
            sal = hw * nhw * nww;
        }
        System.out.println("Total Salary is "+sal);    }
}