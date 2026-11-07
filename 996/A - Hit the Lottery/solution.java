import java.util.Scanner;
 
public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int[] bills = {100, 20, 10, 5, 1};
        int count = 0;
        for (int b : bills) {
            count += n / b;
            n %= b;
        }
        System.out.println(count);
    }
}