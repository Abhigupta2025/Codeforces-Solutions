import java.io.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int n = Integer.parseInt(l.trim());
        String s = r.readLine().trim();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) c++;
        }
        System.out.println(c);
    }
}