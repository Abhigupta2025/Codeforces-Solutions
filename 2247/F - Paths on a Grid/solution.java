import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] A)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter P=new PrintWriter(System.out);
        String l=r.readLine();
        if(l==null)return;
        int t=Integer.parseInt(l.trim());
        Random q=new Random(1337);
        long M=998244353,X=1000000007,Y=1000000009;
        while(t-->0){
            l=r.readLine();
            while(l!=null&&l.trim().isEmpty())l=r.readLine();
            if(l==null)break;
            StringTokenizer k=new StringTokenizer(l);
            int n=Integer.parseInt(k.nextToken());
            int m=Integer.parseInt(k.nextToken());
            int g=n*m;
            boolean[] a=new boolean[g];
            for(int i=0;i<n;i++){
                String s=r.readLine().trim();
                for(int j=0;j<m;j++){
                    a[i*m+j]=(s.charAt(j)=='1');
                }
            }
            boolean[] u=new boolean[g];
            boolean[] v=new boolean[g];
            u[0]=a[0];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int d=i*m+j;
                    if(!a[d]||!u[d])continue;
                    if(i+1<n&&a[d+m])u[d+m]=true;
                    if(j+1<m&&a[d+1])u[d+1]=true;
                }
            }
            v[g-1]=a[g-1];
            for(int i=n-1;i>=0;i--){
                for(int j=m-1;j>=0;j--){
                    int d=i*m+j;
                    if(!a[d]||!v[d])continue;
                    if(i-1>=0&&a[d-m])v[d-m]=true;
                    if(j-1>=0&&a[d-1])v[d-1]=true;
                }
            }
            int c=0;
            for(int i=0;i<g;i++){
                if(u[i]&&v[i])c++;
            }
            int b=g-c;
            if(c==0){
                P.println((pw(2,b,M)-1+M)%M);
                continue;
            }
            long[] w=new long[g],p=new long[g],x=new long[g],y=new long[g];
            for(int i=0;i<g;i++){
                w[i]=1+q.nextInt((int)X-1);
                p[i]=1+q.nextInt((int)X-1);
                x[i]=1+q.nextInt((int)Y-1);
                y[i]=1+q.nextInt((int)Y-1);
            }
            long[] d=new long[g],e=new long[g],f=new long[g],z=new long[g];
            d[0]=1;e[0]=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int h=i*m+j;
                    if(!u[h])continue;
                    if(i>0&&u[h-m]){
                        d[h]=(d[h]+d[h-m]*p[h-m])%X;
                        e[h]=(e[h]+e[h-m]*y[h-m])%Y;
                    }
                    if(j>0&&u[h-1]){
                        d[h]=(d[h]+d[h-1]*w[h-1])%X;
                        e[h]=(e[h]+e[h-1]*x[h-1])%Y;
                    }}}
                    f[g-1]=1;
                    z[g-1]=1;
                    for(int i=n-1;i>=0;i--){
                        for(int j=m-1;j>=0;j--){
                            int h=i*m+j;
                            if(!v[h])continue;
                            if(i+1<n&&v[h+m]){
                                f[h]=(f[h]+f[h+m]*p[h])%X;
                                z[h]=(z[h]+z[h+m]*y[h])%Y;
                            }
                            if(j+1<m&&v[h+1]){
                                f[h]=(f[h]+f[h+1]*w[h])%X;
                                z[h]=(z[h]+z[h+1]*x[h])%Y;
                            }}}
                            long[] h=new long[c];
                            int o=0;
                            for(int i=0;i<g;i++){
                                if(u[i]&&v[i]){
                                    long h1=(d[i]*f[i])%X;
                                    long h2=(e[i]*z[i])%Y;h[o++]=(h1<<32)|h2;
                                }}
                                Arrays.sort(h);
                                long s=0;if(b>0)s=(pw(2,b,M)-1+M)%M;
                                int i=0;
                                while(i<c){
                                    int j=i;
                                    while(j<c&&h[j]==h[i])j++;
                                    int K=j-i;
                                    s=(s+pw(2,K,M)-1+M)%M;i=j;
                                }P.println(s);
        }P.flush();
    }
    static long pw(long a,long b,long m){
        long r=1;
        a%=m;
        while(b>0){
            if((b&1)==1)r=(r*a)%m;
            a=(a*a)%m;b>>=1;
        }
        return r;
    }
}