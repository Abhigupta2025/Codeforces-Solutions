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
            int o = 0, e = 0, d = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(k.nextToken());
                if (x % 2 != 0) o++;
                else if (x % 4 == 0) e++;
                else d++;
            }
            int m = Math.max(o, Math.max(e, d));
            b.append(m).append("
");
        }
        System.out.print(b);
    }
}