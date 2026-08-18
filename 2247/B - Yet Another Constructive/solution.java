import java.io.*;
 
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
            String[] p = l.trim().split("\\s+");
            int n = Integer.parseInt(p[0]);
            int k = Integer.parseInt(p[1]);
            long m = Long.parseLong(p[2]);
            if (k > m) {
                b.append("NO
");
            } else {
                b.append("YES
");
                long v = m - k + 1;
                for (int i = 1; i <= n; i++) {
                    if (i % k == 0) {
                        b.append(v);
                    } else {
                        b.append(1);
                    }
                    b.append(i == n ? "" : " ");
                }
                b.append("
");
            }
        }
        System.out.print(b);
    }
}