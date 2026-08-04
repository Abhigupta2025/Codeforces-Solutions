import java.util.Scanner;
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int u = 0;
            for (int i = 0; i < n; i++) {
                u += s.nextInt();
            }
            if ((n * k) % 2 == 0 || u % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}