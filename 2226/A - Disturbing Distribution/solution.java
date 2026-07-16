import java.util.*;
public class Main{public static void main(String[] x){
    Scanner q=new Scanner(System.in);
    int t=q.nextInt();
    while(t-->0){
        int n=q.nextInt();
        int[] a=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            a[i]=q.nextInt();
            if(a[i]>=2)s+=a[i];
            
        }
        if(a[n-1]==1)s+=1;
        System.out.println(s%676767677);
        
        }
    
    }
    
}