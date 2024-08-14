import java.util.*;
class Series {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        int n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            int term = a;
            for (int j = 0; j < i; j++) {
                term += (int) Math.pow(2, j) * b;
            }
            System.out.print(term + " ");
        }
    }
}