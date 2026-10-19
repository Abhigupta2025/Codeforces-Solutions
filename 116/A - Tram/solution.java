import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int m = 0, c = 0;
        while (n-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            c += b - a;
            if (c > m) m = c;
        }
        System.out.println(m);
    }
}