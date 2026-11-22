import java.io.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        if (a == null) return;
        String b = r.readLine().trim();
        String c = r.readLine().trim();
        a = a.trim();
 
        if (a.length() + b.length() != c.length()) {
            System.out.println("NO");
            return;
        }
 
        int[] f = new int[26];
        for (int i = 0; i < a.length(); i++) f[a.charAt(i) - 'A']++;
        for (int i = 0; i < b.length(); i++) f[b.charAt(i) - 'A']++;
        for (int i = 0; i < c.length(); i++) f[c.charAt(i) - 'A']--;
 
        for (int x : f) {
            if (x != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}