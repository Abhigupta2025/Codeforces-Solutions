import java.io.*;
import java.util.*;
 
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
 
    static long r() throws Exception {
        int c = k();
        while (c <= 32) {
            if (c == -1) return Long.MIN_VALUE;
            c = k();
        }
        int s = 1;
        if (c == '-') {
            s = -1;
            c = k();
        }
        long x = 0;
        while (c > 32) {
            x = x * 10 + (c - '0');
            c = k();
        }
        return x * s;
    }
 
    static void u(int[] t, int n, int i, int v) {
        for (i += n; i > 0; i >>= 1) {
            if (v > t[i]) t[i] = v;
        }
    }
 
    static int q(int[] t, int n, int l, int r) {
        int m = -1;
        for (l += n, r += n; l <= r; l >>= 1, r >>= 1) {
            if ((l & 1) == 1) {
                if (t[l] > m) m = t[l];
                l++;
            }
            if ((r & 1) == 0) {
                if (t[r] > m) m = t[r];
                r--;
            }
        }
        return m;
    }
 
    public static void main(String[] z) throws Exception {
        long c = r();
        if (c == Long.MIN_VALUE) return;
        int t = (int) c;
        StringBuilder b = new StringBuilder();
        while (t-- > 0) {
            int n = (int) r();
            long[] a = new long[n + 1];
            long[] s = new long[n + 1];
            long[] u = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = r();
                s[i] = s[i - 1] + a[i];
                u[i] = s[i];
            }
            u[0] = s[0];
            Arrays.sort(u);
            int m = 0;
            for (int i = 0; i <= n; i++) {
                if (i == 0 || u[i] != u[i - 1]) {
                    u[m++] = u[i];
                }
            }
            int[] f = new int[2 * m];
            Arrays.fill(f, -1);
            int[] l = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                int w = Arrays.binarySearch(u, 0, m, s[i - 2]);
                u(f, m, w, i - 2);
                int y = Arrays.binarySearch(u, 0, m, s[i]);
                l[i] = q(f, m, y, m - 1);
            }
            PriorityQueue<Long> h = new PriorityQueue<>(Collections.reverseOrder());
            int[] d = new int[n + 2];
            d[n] = a[n] > 0 ? 1 : 0;
            for (int i = n - 1; i >= 1; i--) {
                int j = i + 1;
                int x = l[j] + 2;
                if (x <= j - 1) {
                    long v = (long) (d[j] + j) << 32 | (long) x;
                    h.add(v);
                }
                while (!h.isEmpty() && (int) (h.peek().longValue()) > i) {
                    h.poll();
                }
                int v = d[i + 1] + (a[i] > 0 ? 1 : 0);
                if (!h.isEmpty()) {
                    int w = (int) (h.peek() >> 32) - i;
                    if (w > v) v = w;
                }
                d[i] = v;
            }
            b.append(d[1]).append("
");
        }
        System.out.print(b);
    }
}