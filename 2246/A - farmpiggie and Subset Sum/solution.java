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
                if (i % 2 != 0) {
                    b.append(i + 1);
                } else {
                    b.append(i - 1);
                }
                b.append(i == n ? "" : " ");
            }
            System.out.println(b);
        }
    }
}