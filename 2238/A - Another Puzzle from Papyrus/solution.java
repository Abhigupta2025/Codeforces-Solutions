import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int c = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int u = 0, v = 0;
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                u += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = s.nextInt();
                v += b[i];
            }
            boolean p = true;
            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    p = false;
                    break;
                }
            }
            if (p) {
                System.out.println(u - v);
                continue;
            }
            Arrays.sort(a);
            Arrays.sort(b);
            boolean q = true;
            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    q = false;
                    break;
                }
            }
            if (q) {
                System.out.println(c + u - v);
            } else {
                System.out.println(-1);
            }
        }
    }
}