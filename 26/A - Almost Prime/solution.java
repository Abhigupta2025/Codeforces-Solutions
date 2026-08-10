import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int[] p = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (p[i] == 0) {
                for (int j = 2 * i; j <= n; j += i) {
                    p[j]++;
                }
            }
        }
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (p[i] == 2) c++;
        }
        System.out.println(c);
    }
}