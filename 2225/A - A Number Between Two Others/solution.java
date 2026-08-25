import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            long x = s.nextLong();
            long y = s.nextLong();
            if (y == 2 * x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}