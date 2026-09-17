import java.io.*;
 
public class Main {
    static int p = 0, u = 0;
    static byte[] d = new byte[1 << 16];
 
    static int k() throws Exception {
        if (p >= u) {
            u = System.in.read(d, 0, d.length);
            if (u <= 0) return -1;
            p = 0;
        }
        return d[p++];
    }
 
    static int r() throws Exception {
        int c = k();
        while (c <= 32) {
            if (c == -1) return -1;
            c = k();
        }
        int x = 0;
        while (c > 32) {
            x = x * 10 + (c - '0');
            c = k();
        }
        return x;
    }
 
    public static void main(String[] z) throws Exception {
        int t = r();
        if (t == -1) return;
        StringBuilder b = new StringBuilder();
        int[] c = new int[200005];
        while (t-- > 0) {
            int n = r();
            int m = r();
            for (int i = 0; i < n; i++) {
                c[r()]++;
            }
            int s = 0, w = 0;
            for (int i = m; i >= 1; i--) {
                s += c[i];
                int v = s + (2 * i <= m ? c[2 * i] : 0);
                if (v > w) w = v;
            }
            for (int i = 1; i <= m; i++) c[i] = 0;
            b.append(w).append("
");
        }
        System.out.print(b);
    }
}