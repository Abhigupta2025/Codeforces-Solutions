import java.util.*;
public class Main{
    public static void main(String[] x){
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        while(t-->0){
            int n=q.nextInt();
            int u=1001,v=0;
            for(int i=0;i<n;i++){
                int a=q.nextInt();
                if(a<u)u=a;
                if(a>v)v=a;
            }
            System.out.println((v-u+1)/2);
        }
    }
}