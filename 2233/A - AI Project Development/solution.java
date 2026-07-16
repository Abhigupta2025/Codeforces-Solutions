import java.util.* ;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(),x = sc.nextInt(), y = sc.nextInt(),z = sc.nextInt();
            int sum1 = 0,c1 = 0, sum2 = 0 , c2 = 0;
                while(z-->0){
                    sum1 += x;
                c1++;
                }
                while(n> sum1){
                    sum1 += x + 10*y;
                    c1++;
                }
                while(n> sum2){
                    sum2 += x+y;
                    c2++; 
            }
             int min =   c1<c2? c1:c2 ; 
             System.out.println(min);
 
        }
 
    }
}