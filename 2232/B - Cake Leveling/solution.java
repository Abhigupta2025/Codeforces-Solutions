import java.util.*;
public class Main{
    public static void main(String[] x){
        Scanner q=new Scanner(System.in);
        if(!q.hasNextInt())return;
        int t=q.nextInt();
        while(t-->0){
            int n=q.nextInt();
            long s=0,m=Long.MAX_VALUE;
            for(long i=1;i<=n;i++){
                long v=q.nextLong();
                s+=v;
                long u=s/i;
                if(u<m)m=u;
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}