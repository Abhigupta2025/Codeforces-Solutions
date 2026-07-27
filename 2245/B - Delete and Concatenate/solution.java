import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long[] a = new long[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                totalSum += a[i];
            }
            Arrays.sort(a);
            
            long maxScore = Long.MIN_VALUE;
            long smallSum = 0;
            for (int k = 0; k <= n / 2; k++) {
                if (k > 0) {
                    smallSum += a[k - 1];
                }
                long currentScore = totalSum - (n - k) * c - smallSum;
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }
            System.out.println(maxScore);
        }
    }
}