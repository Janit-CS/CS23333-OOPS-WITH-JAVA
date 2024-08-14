import java.util.*;

class Diam {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        for (int i = 1; i <= a; i++ ) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1) ; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a-1; i >= 1; i-- ) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1) ; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
