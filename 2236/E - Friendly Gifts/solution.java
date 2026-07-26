import java.util.*;
public class Main{
    public static void main(String[] z){
        Scanner q=new Scanner(System.in);
        if(!q.hasNextInt())return;
        int t=q.nextInt();
        while(t-->0){
            int n=q.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=q.nextInt();
            }
            int m=0;
            for(int w=1;w<=n/2;w++){
                int[] f=new int[n+1];
                int[] g=new int[n+1];
                Arrays.fill(f,-1);
                Arrays.fill(g,-1);
                int[] c=new int[n+1];
                int d=0;
                ArrayDeque<Integer> u=new ArrayDeque<>(),v=new ArrayDeque<>();
                for(int i=0;i<n;i++){
                    if(c[a[i]]++==0)d++;
                    while(!u.isEmpty()&&a[u.peekLast()]>=a[i])u.pollLast();
                    u.addLast(i);
                    while(!v.isEmpty()&&a[v.peekLast()]<=a[i])v.pollLast();
                    v.addLast(i);
                    if(i>=w){
                        int o=a[i-w];
                        if(--c[o]==0)d--;
                        if(u.peekFirst()==i-w)u.pollFirst();
                        if(v.peekFirst()==i-w)v.pollFirst();
                    }
                    if(i>=w-1){
                        int s=i-w+1;
                        if(d==w&&a[v.peekFirst()]-a[u.peekFirst()]==w-1){
                            int x=a[u.peekFirst()];
                            if(f[x]==-1)f[x]=s;g[x]=s;
                        }
                    }
                }
                boolean b=false;
                for(int x=1;x+w<=n;x++){
                    if(f[x]!=-1&&f[x+w]!=-1){
                        if(g[x]>=f[x+w]+w||g[x+w]>=f[x]+w){
                            b=true;
                            break;
                        }
                    }
                }
                if(b)m=w;
            }
            System.out.println(m);
        }
    }
}