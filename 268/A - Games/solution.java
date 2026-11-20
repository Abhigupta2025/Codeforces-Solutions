import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = s.nextInt();
            a[i] = s.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && h[i] == a[j]) c++;
            }
        }
        System.out.println(c);
    }
}