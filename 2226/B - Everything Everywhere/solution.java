import java.io.*;
import java.util.*;
 
public class Main {
    static int g(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
 
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int t = Integer.parseInt(l.trim());
        StringBuilder b = new StringBuilder();
        while (t-- > 0) {
            l = r.readLine();
            while (l != null && l.trim().isEmpty()) l = r.readLine();
            if (l == null) break;
            int n = Integer.parseInt(l.trim());
            StringTokenizer k = new StringTokenizer(r.readLine());
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(k.nextToken());
            }
            int c = 0;
            for (int i = 0; i < n - 1; i++) {
                int d = Math.abs(p[i] - p[i + 1]);
                if (d == g(p[i], p[i + 1])) {
                    c++;
                }
            }
            b.append(c).append("
");
        }
        System.out.print(b);
    }
}