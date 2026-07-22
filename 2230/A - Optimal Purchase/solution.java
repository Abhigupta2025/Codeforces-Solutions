import java.util.*;
public class Main{
    public static void main(String[] k){
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        while(t-->0){
            long n=q.nextLong();
            long a=q.nextLong();
            long b=q.nextLong();
            long x=n*a;
            long y=(n/3)*b+(n%3)*a;
            long z=((n+2)/3)*b;
            long m=Math.min(x,Math.min(y,z));
            System.out.println(m);
        }
    }
}