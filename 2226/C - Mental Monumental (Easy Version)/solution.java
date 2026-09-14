import java.io.*;
import java.util.*;
 
public class Main {
    static boolean f(int m, int[] c, int x, int[] w) {
        Arrays.fill(w, 0, m, 0);
        int s = 0;
        for (int i = 0; i <= x; i++) {
            if (c[i] == 0) continue;
            int k = (i < m) ? c[i] - 1 : c[i];
            if (k > 0) {
                int p = (i - 1) / 2;
                if (p >= m) s += k;
                else if (p >= 0) w[p] += k;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            s += w[i];
            if (i > x || c[i] == 0) {
                if (s <= 0) return false;
                s--;
            }
        }
        return true;
    }
 
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int t = Integer.parseInt(l.trim());
        StringBuilder b = new StringBuilder();
        int[] w = new int[200005];
        while (t-- > 0) {
            l = r.readLine();
            while (l != null && l.trim().isEmpty()) l = r.readLine();
            if (l == null) break;
            int n = Integer.parseInt(l.trim());
            int[] a = new int[n];
            int x = 0;
            StringTokenizer k = new StringTokenizer(r.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(k.nextToken());
                if (a[i] > x) x = a[i];
            }
            int[] c = new int[x + 1];
            for (int i = 0; i < n; i++) c[a[i]]++;
            int g = 1, h = n + 1, v = 1;
            while (g <= h) {
                int m = (g + h) / 2;
                if (f(m, c, x, w)) {
                    v = m;
                    g = m + 1;
                } else {
                    h = m - 1;
                }
            }
            b.append(v).append("
");
        }
        System.out.print(b);
    }
}