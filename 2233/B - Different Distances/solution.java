import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            if (n == 2) {
                System.out.println("1 2 1 1 2 2 1 2");
                continue;
            }
            int[] a = new int[4 * n];
            for (int i = 0; i < n; i++) {
                int v = i + 1;
                a[i] = v;
                a[n + i] = v;
                a[2 * n + (i + 1) % n] = v;
                a[3 * n + (i + 3) % n] = v;
            }
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < 4 * n; i++) {
                b.append(a[i]).append(i == 4 * n - 1 ? "" : " ");
            }
            System.out.println(b);
        }
    }
}