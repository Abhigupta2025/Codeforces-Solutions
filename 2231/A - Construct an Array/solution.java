import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            StringBuilder b = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                int v = i + (i - 1) / 2;
                b.append(v).append(i == n ? "" : " ");
            }
            System.out.println(b);
        }
    }
}