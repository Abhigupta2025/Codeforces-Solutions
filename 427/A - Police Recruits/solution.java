import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int n = Integer.parseInt(l.trim());
        StringTokenizer s = new StringTokenizer(r.readLine());
        int p = 0, u = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s.nextToken());
            if (x > 0) p += x;
            else if (p > 0) p--;
            else u++;
        }
        System.out.println(u);
    }
}