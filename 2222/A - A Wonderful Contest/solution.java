import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                if (s.nextInt() == 100) {
                    f = true;
                }
            }
            if (f) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}