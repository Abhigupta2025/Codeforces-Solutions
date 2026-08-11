import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long r = 0;
            for (int i = 1; i <= n; i++) {
                long k = n / i;
                r += k * k;
            }
            System.out.println(r);
        }
    }
}