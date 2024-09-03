import java.util.*;

class Week
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        String day = ip.nextLine();
        int flag = 2;
        switch (day)
        {
            case "Monday":
                flag = 1;
                break;
            case "Tuesday":
                flag = 1;
                break;
            case "Wednesday":
                flag = 1;
                break;
            case "Thursday":
                flag = 1;
                break;
            case "Friday":
                flag = 1;
                break;
            case "Saturday":
                flag = 0;
                break;
            case "Sunday":
                flag = 0;
                break;
        }
        if(flag == 1)
        {
            System.out.println("Yes, it is a weekday.");
        }
        else if(flag == 0)
        {
            System.out.println("Yes, it is a weekend.");
        }
        else
        {
            System.out.println("Invalid day.");
        }
    }
}