import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong();
            long k = s.nextLong();
            long r = 0;
            for (int i = 0; i <= 30 && n > 0; i++) {
                long b = 1L << i;
                long m = Math.min(k, n / b);
                r += m;
                n -= m * b;
            }
            System.out.println(r);
        }
    }
}