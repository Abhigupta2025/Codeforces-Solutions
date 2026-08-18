import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            long[] a = new long[3];
            a[0] = s.nextLong();
            a[1] = s.nextLong();
            a[2] = s.nextLong();
            Arrays.sort(a);
            System.out.println(Math.min(a[2] - a[0], a[1]));
        }
    }
}