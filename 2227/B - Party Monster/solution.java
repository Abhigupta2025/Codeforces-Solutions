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
            int n = Integer.parseInt(l.trim());
            String s = r.readLine().trim();
            if (n % 2 != 0) {
                b.append("NO
");
                continue;
            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') c++;
            }
            if (c == n / 2) b.append("YES
");
            else b.append("NO
");
        }
        System.out.print(b);
    }
}