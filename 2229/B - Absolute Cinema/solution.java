import java.io.*;
import java.util.*;
 
public class Main {
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
            long[] a = new long[n];
            StringTokenizer k = new StringTokenizer(r.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(k.nextToken());
            k = new StringTokenizer(r.readLine());
            long s = 0, m = 0;
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(k.nextToken());
                long u = Math.max(a[i], x);
                long v = Math.min(a[i], x);
                s += u;
                if (v > m) m = v;
            }
            b.append(s + m).append("
");
        }
        System.out.print(b);
    }
}