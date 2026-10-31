import java.io.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        if (a == null || b == null) return;
        a = a.trim();
        b = b.trim();
        char[] ans = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            ans[i] = (a.charAt(i) != b.charAt(i)) ? '1' : '0';
        }
        System.out.println(new String(ans));
    }
}