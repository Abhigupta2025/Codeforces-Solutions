import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            a[0] = s.nextInt();
            a[1] = s.nextInt();
            a[2] = s.nextInt();
            int c = 0;
            while (true) {
                Arrays.sort(a);
                if (a[0] == a[1] || a[1] == a[2]) break;
                a[0]++;
                a[2]--;
                c++;
            }
            System.out.println(c);
        }
    }
}