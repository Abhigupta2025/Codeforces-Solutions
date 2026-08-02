import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextLong()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong();
            long r = n % 12;
            long a = r;
            if (r == 10) a = 22;
            if (n < a) {
                System.out.println(-1);
            } else {
                System.out.println(a + " " + (n - a));
            }
        }
    }
}