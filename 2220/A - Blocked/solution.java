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
            boolean p = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    p = true;
                    break;
                }
            }
            if (p) {
                System.out.println(-1);
            } else {
                StringBuilder b = new StringBuilder();
                for (int i = n - 1; i >= 0; i--) {
                    b.append(a[i]).append(i == 0 ? "" : " ");
                }
                System.out.println(b);
            }
        }
    }
}