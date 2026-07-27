import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] u = new long[35];
        long[] v = new long[35];
        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            int c1 = 0;
            long curr = a;
            u[c1++] = curr;
            while (curr > 0) {
                curr /= x;
                u[c1++] = curr;
            }
            int c2 = 0;
            curr = b;
            v[c2++] = curr;
            while (curr > 0) {
                curr /= x;
                v[c2++] = curr;
            }
            long ans = Math.abs(a - b);
            for (int i = 0; i < c1; i++) {
                for (int j = 0; j < c2; j++) {
                    long cost = (long) i + j + Math.abs(u[i] - v[j]);
                    if (cost < ans) {
                        ans = cost;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}