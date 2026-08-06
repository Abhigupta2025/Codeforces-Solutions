import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        while (t-- > 0) {
            String w = s.next();
            int n = w.length();
            String b = "";
            for (int i = 0; i < n; i++) {
                if (w.charAt(i) == '0') {
                    String u = w.substring(0, i) + w.substring(i + 1);
                    int p = -1;
                    for (int j = 0; j < u.length() - 1; j++) {
                        if (u.charAt(j) == '1' && u.charAt(j + 1) == '0') {
                            p = j;
                            break;
                        }
                    }
                    if (p == -1) p = u.lastIndexOf('1');
                    String r = u.substring(0, p) + u.substring(p + 1);
                    if (b.equals("") || r.compareTo(b) > 0) {
                        b = r;
                    }
                }
            }
            System.out.println(b);
        }
    }
}