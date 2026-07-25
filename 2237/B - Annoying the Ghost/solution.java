import java.util.*;
public class Main{
    public static void main(String[] x){
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        while(t-->0){
            int n=q.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++)a[i]=q.nextInt();
            for(int i=0;i<n;i++)b[i]=q.nextInt();
            boolean[] u=new boolean[n];
            long s=0;
            boolean f=true;
            for(int i=0;i<n;i++){
                int p=-1,c=0;
                for(int j=0;j<n;j++){
                    if(!u[j]){
                        if(a[j]<=b[i]&&p==-1)p=j;
                        if(p==-1)c++;
                    }
                }
                if(p==-1){
                    f=false;
                    break;
                }
                s+=c;
                u[p]=true;
            }
            if(f)System.out.println(s);
            else System.out.println(-1);
        }
    }
}