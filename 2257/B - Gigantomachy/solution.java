import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            long a = s.nextLong();
            for (int i = 1; i < n; i++) s.nextLong();
            long b = s.nextLong();
            for (int i = 1; i < m; i++) s.nextLong();
            if (a + n >= b + m) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}