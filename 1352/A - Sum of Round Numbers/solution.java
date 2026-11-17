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
            int n = Integer.parseInt(r.readLine().trim());
            List<Integer> a = new ArrayList<>();
            int p = 1;
            while (n > 0) {
                int d = n % 10;
                if (d > 0) a.add(d * p);
                n /= 10;
                p *= 10;
            }
            b.append(a.size()).append('
');
            for (int i = 0; i < a.size(); i++) {
                b.append(a.get(i)).append(i + 1 == a.size() ? "" : " ");
            }
            b.append('
');
        }
        System.out.print(b);
    }
}