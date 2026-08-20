import java.util.Scanner;
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                s.nextInt();
            }
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < n; i++) {
                b.append(n == 1 ? 1 : 2).append(i == n - 1 ? "" : " ");
            }
            System.out.println(b);
        }
    }
}