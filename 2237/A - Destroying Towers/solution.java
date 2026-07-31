import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = Integer.MAX_VALUE;
            long r = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                if (x < m) m = x;
                r += m;
            }
            System.out.println(r);
        }
    }
}