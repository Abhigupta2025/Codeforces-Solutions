import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println(max - min);
    }
}