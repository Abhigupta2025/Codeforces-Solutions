import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long c = s.nextLong();
            long k = s.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (a[i] <= c) {
                    long u = Math.min(k, c - a[i]);
                    k -= u;
                    c += a[i] + u;
                } else {
                    break;
                }
            }
            System.out.println(c);
        }
    }
}