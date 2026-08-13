import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int u = 0;
            int v = -100;
            for (int i = 0; i < 7; i++) {
                int x = s.nextInt();
                u += x;
                if (x > v) v = x;
            }
            System.out.println(2 * v - u);
        }
    }
}