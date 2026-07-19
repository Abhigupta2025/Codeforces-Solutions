import java.util.*;
public class Main{
    public static void main(String[] x){
        Scanner q=new Scanner(System.in);
        int t=q.nextInt();
        while(t-->0){
            String s=q.next();
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='Y')c++;
            }if(c>1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}