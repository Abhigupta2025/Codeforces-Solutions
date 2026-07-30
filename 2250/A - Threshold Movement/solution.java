import java.util.Scanner;
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int l = 0, r = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                if (i % 2 == 0) {
                    if (x < r) r = x;
                } else {
                    if (x > l) l = x;
                }
            }
            if (n % 2 != 0 || l + 1 >= r) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}