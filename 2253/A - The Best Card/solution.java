import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt() + 1;
            boolean p = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    p = false;
                    break;
                }
            }
            if (p) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}