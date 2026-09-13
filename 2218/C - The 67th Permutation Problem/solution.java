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
            for (int i = 1; i <= n; i++) {
                b.append(i).append(" ").append(n + 2 * i - 1).append(" ").append(n + 2 * i).append(i == n ? "" : " ");
            }
            b.append("
");
        }
        System.out.print(b);
    }
}