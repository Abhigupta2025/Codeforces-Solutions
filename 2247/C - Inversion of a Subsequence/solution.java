import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] x)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter p=new PrintWriter(System.out);
        String l=r.readLine();if(l==null)return;
        int t=Integer.parseInt(l.trim());
        while(t-->0){
            l=r.readLine();
            while(l!=null&&l.trim().isEmpty())l=r.readLine();
            if(l==null)break;
            int n=Integer.parseInt(l.trim());
            int[] a=new int[n];
            int[] b=new int[n];
            StringTokenizer k=new StringTokenizer(r.readLine());
            for(int i=0;i<n;i++)a[i]=Integer.parseInt(k.nextToken());
            k=new StringTokenizer(r.readLine());
            for(int i=0;i<n;i++)b[i]=Integer.parseInt(k.nextToken());
            boolean e=true;
            int s=0,u=0,c=0;
            for(int i=0;i<n;i++){
                if(a[i]!=b[i])e=false;
                if(a[i]==1)s++;
                if(b[i]==1)u++;
                if(a[i]==1&&b[i]==0)c++;
            }
            if(e)p.println(0);
            else if(s==0||u==n)p.println(-1);
            else if(c%2==1)p.println(1);
            else p.println(2);
        }
        p.flush();
    }
}