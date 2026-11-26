import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int k = s.nextInt();
        int l = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int p = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
 
        int x = (k * l) / a;
        int y = c * d;
        int w = p / b;
 
        System.out.println(Math.min(x, Math.min(y, w)) / n);
    }
}