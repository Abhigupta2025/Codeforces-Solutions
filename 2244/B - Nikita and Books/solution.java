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
            StringTokenizer k = new StringTokenizer(r.readLine());
            long s = 0;
            boolean f = true;
            for (long i = 1; i <= n; i++) {
                s += Long.parseLong(k.nextToken());
                if (s < i * (i + 1) / 2) {
                    f = false;
                }
            }
            if (f) b.append("YES
");
            else b.append("NO
");
        }
        System.out.print(b);
    }
}