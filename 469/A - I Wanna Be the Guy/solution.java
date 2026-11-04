import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        boolean[] seen = new boolean[n + 1];
        int count = 0;
 
        int p = s.nextInt();
        for (int i = 0; i < p; i++) {
            int x = s.nextInt();
            if (!seen[x]) {
                seen[x] = true;
                count++;
            }
        }
 
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int y = s.nextInt();
            if (!seen[y]) {
                seen[y] = true;
                count++;
            }
        }
 
        if (count == n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}