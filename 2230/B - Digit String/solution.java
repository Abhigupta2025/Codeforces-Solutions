import java.io.*;
public class Main{
    public static void main(String[] a)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        String l=r.readLine();
        if(l==null)return;
        int t=Integer.parseInt(l.trim());
        while(t-->0){
            String s=r.readLine().trim();
            int n=s.length(),u=0,v=0;
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='1'||c=='3')u++;
            }
            int m=u;
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='1'||c=='3')u--;
                if(c=='2')v++;
                if(v+u>m)m=v+u;
            }
            System.out.println(n-m);
        }
    }
}