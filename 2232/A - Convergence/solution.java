import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            int m = n;
            for (int i = 0; i < n; i++) {
                int l = 0, r = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] < a[i]) l++;
                    if (a[j] > a[i]) r++;
                }
                int x = Math.max(l, r);
                if (x < m) m = x;
            }
            System.out.println(m);
        }
    }
}