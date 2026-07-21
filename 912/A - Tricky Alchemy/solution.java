import java.util.*;
public class Main{
    public static void main(String[] k){
        Scanner q=new Scanner(System.in);
        long a=q.nextLong();
        long b=q.nextLong();
        long x=q.nextLong();
        long y=q.nextLong();
        long z=q.nextLong();
        long u=2*x+y;
        long v=y+3*z;
        long s=0;
        if(u>a)s+=u-a;
        if(v>b)s+=v-b;
        System.out.println(s);
    }
}