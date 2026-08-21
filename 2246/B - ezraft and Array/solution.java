import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            if (n == 2) {
                System.out.println(-1);
            } else if (n == 1) {
                System.out.println(1);
            } else {
                StringBuilder b = new StringBuilder();
                b.append("1 2 3");
                long v = 3;
                for (int i = 4; i <= n; i++) {
                    v *= 2;
                    b.append(" ").append(v);
                }
                System.out.println(b);
            }
        }
    }
}