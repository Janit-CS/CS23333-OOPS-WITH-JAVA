import java.util.*;

class Ticket
{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String ticket = ip.nextLine();
        int notick = ip.nextInt();
        int price = 0;
        switch (ticket) {
            case "Regular":
                if (notick < 10)
                {
                    price = 50 * notick;
                }
                else if (notick >= 10)
                {
                    int dis = 50 * notick * 10 / 100;
                    price = 50 * notick - dis;
                }
                break;

            case "VIP":
                if (notick < 5)
                {
                    price = 100 * notick;
                }
                else if (notick >= 5)
                {
                    int dis = 100 * notick * 15 / 100;
                    price = 100 * notick - dis;
                }
                break;

            case "Premium":
                if (notick < 3)
                {
                    price = 150 * notick;
                }
                else if (notick >= 3)
                {
                    int dis = 150 * notick * 20 / 100;
                    price = 150 * notick - dis;
                }
                break;
        }
        System.out.println("Price: " + price);
    }
}