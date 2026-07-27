import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            long c = sc.nextLong();
            long[] a = new long[m];
            long totalSum = 0;
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextLong();
                totalSum += a[i];
            }
            Arrays.sort(a);
            
            long maxScore = Long.MIN_VALUE;
            long smallSum = 0;
            for (int k = 0; k <= m / 2; k++) {
                if (k > 0) {
                    smallSum += a[k - 1];
                }
                long currentScore = totalSum - (m - k) * c - smallSum;
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }
            System.out.println(maxScore);
        }
    }
}