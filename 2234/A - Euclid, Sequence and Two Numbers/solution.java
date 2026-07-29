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
            boolean p = true;
            for (int i = n - 1; i >= 2; i--) {
                if (a[i] % a[i - 1] != a[i - 2]) {
                    p = false;
                    break;
                }
            }
            if (p) {
                System.out.println(a[n - 1] + " " + a[n - 2]);
            } else {
                System.out.println(-1);
            }
        }
    }
}