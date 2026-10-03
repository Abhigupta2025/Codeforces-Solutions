import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println((m * n) / 2);
    }
}