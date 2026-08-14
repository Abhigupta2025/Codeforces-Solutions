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
            int c = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) c++;
            }
            int m = 0;
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                    if (s.charAt(i - 1) == s.charAt(i + 1)) {
                        if (m < 2) m = 2;
                    } else {
                        if (m < 1) m = 1;
                    }
                }
            }
            b.append(c - m).append("
");
        }
        System.out.print(b);
    }
}