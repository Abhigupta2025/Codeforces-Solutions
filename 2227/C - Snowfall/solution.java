import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] z)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter p=new PrintWriter(System.out);
        String l=r.readLine();
        if(l==null)return;
        int t=Integer.parseInt(l.trim());
        while(t-->0){
            l=r.readLine();
            while(l!=null&&l.trim().isEmpty())l=r.readLine();
            if(l==null)break;
            int n=Integer.parseInt(l.trim());
            StringTokenizer k=new StringTokenizer(r.readLine());
            List<Integer>a=new ArrayList<>(),b=new ArrayList<>(),c=new ArrayList<>(),d=new ArrayList<>();
            for(int i=0;i<n;i++){
                int v=Integer.parseInt(k.nextToken());
                if(v%6==0)a.add(v);
                else if(v%2==0)b.add(v);
                else if(v%3==0)d.add(v);
                else c.add(v);
            }
            for(int v:a)p.print(v+" ");
            for(int v:b)p.print(v+" ");
            for(int v:c)p.print(v+" ");
            for(int v:d)p.print(v+" ");
            p.println();}p.flush();
    }
}