import java.util.*;
public class Main{public static void main(String[] x){
    Scanner q=new Scanner(System.in);
    int t=q.nextInt();
    while(t-->0){
        int k=q.nextInt();
        int u=0,v=0;
        for(int i=0;i<k;i++){
            int c=q.nextInt();
            if(c>=3)u++;
            if(c>=2)v++;
        }
        if(u>=1||v>=2)System.out.println("YES");
        else System.out.println("NO");
        }
    }
}