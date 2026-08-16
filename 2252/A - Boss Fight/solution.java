import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] c = new int[1001];
            long u = 0;
            int m = 0, v = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                u += x;
                c[x]++;
                if (c[x] > m) {
                    m = c[x];
                    v = x;
                }
            }
            if (m <= (n + 1) / 2) {
                System.out.println(u);
            } else {
                long r = u - (long) m * v + (long) (n - m + 2) * v;
                System.out.println(r);
            }
        }
    }
}