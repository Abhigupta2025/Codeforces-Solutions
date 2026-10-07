import java.io.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        if (s == null) return;
        s = s.trim();
        int[] c = new int[4];
        for (int i = 0; i < s.length(); i += 2) {
            c[s.charAt(i) - '0']++;
        }
        StringBuilder b = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            while (c[i]-- > 0) {
                if (b.length() > 0) b.append('+');
                b.append(i);
            }
        }
        System.out.println(b);
    }
}