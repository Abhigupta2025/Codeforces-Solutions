import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long k = 1;
            HashSet<Integer> hs=new HashSet<>();
            for(int i = 2;i*i<=n;i++){
                while(n%i == 0){
                    hs.add(i);
                    n/= i;
                }
            }
            hs.add((int)n);
            for(int s:hs) {k*= s;}
            System.out.println(k);
        }
    }
}