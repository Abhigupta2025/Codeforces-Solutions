import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        StringTokenizer s = new StringTokenizer(l);
        int n = Integer.parseInt(s.nextToken());
        int h = Integer.parseInt(s.nextToken());
        s = new StringTokenizer(r.readLine());
        int w = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(s.nextToken()) > h) w += 2;
            else w++;
        }
        System.out.println(w);
    }
}