import java.util.*;

class Tripat
{
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 0) ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
}