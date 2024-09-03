import java.util.Scanner;

class IndexPri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!isPrime[i]) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of elements at non-prime indices: " + sum);
    }
}