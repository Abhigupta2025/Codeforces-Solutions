import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            boolean[] v = new boolean[26];
            for (int i = 0; i < n; i++) {
                v[s.next().charAt(0) - 'a'] = true;
            }
            String[] a = new String[m];
            for (int i = 0; i < m; i++) {
                a[i] = s.next();
            }
            boolean[] u = new boolean[m];
            int c = 0;
            while (true) {
                boolean k = false;
                for (int i = 0; i < m; i++) {
                    if (!u[i]) {
                        boolean p = true;
                        for (int j = 0; j < a[i].length(); j++) {
                            if (!v[a[i].charAt(j) - 'A']) {
                                p = false;
                                break;
                            }
                        }
                        if (p) {
                            u[i] = true;
                            v[a[i].charAt(0) - 'A'] = true;
                            c++;
                            k = true;
                        }
                    }
                }
                if (!k) break;
            }
            if (c == m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}