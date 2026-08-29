import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int m = s.nextInt();
        String[] g = new String[n];
        for (int i = 0; i < n; i++) {
            g[i] = s.next();
        }
        int u = n, d = -1, l = m, r = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i].charAt(j) == '*') {
                    if (i < u) u = i;
                    if (i > d) d = i;
                    if (j < l) l = j;
                    if (j > r) r = j;
                }
            }
        }
        for (int i = u; i <= d; i++) {
            System.out.println(g[i].substring(l, r + 1));
        }
    }
}