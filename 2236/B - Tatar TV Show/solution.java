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
            int p = l.indexOf(' ');
            int n = Integer.parseInt(l.substring(0, p));
            int k = Integer.parseInt(l.substring(p + 1));
            String s = r.readLine().trim();
            int[] c = new int[k];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    c[i % k] ^= 1;
                }
            }
            boolean f = true;
            for (int i = 0; i < k; i++) {
                if (c[i] != 0) {
                    f = false;
                    break;
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