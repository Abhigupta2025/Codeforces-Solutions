import java.io.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int n = Integer.parseInt(l.trim());
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        String s = r.readLine().trim().toLowerCase();
        int mask = 0;
        for (int i = 0; i < n; i++) {
            mask |= 1 << (s.charAt(i) - 'a');
        }
        System.out.println(mask == (1 << 26) - 1 ? "YES" : "NO");
    }
}