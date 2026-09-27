import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int w = s.nextInt();
        if (w > 2 && w % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}