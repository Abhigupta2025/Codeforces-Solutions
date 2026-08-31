import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                if (x == 0) a++;
                else if (x == 1) b++;
                else c++;
            }
            int m = Math.min(b, c);
            int r = a + m + (Math.abs(b - c) / 3);
            System.out.println(r);
        }
    }
}