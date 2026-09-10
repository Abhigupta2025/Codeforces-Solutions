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
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(k.nextToken());
            }
            int c = 0;
            ArrayList<Integer> p = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                long v = a[i];
                if (c % 2 != 0) v = -v;
                if (v > 0) {
                    p.add(i + 1);
                    c++;
                }
            }
            b.append(p.size()).append("
");
            for (int i = 0; i < p.size(); i++) {
                b.append(p.get(i)).append(i == p.size() - 1 ? "" : " ");
            }
            b.append("
");
        }
        System.out.print(b);
    }
}