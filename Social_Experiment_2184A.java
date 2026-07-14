/*
Problem: 2184A - Social Experiment 
Platform: Codeforces
Language: java
*/




import java.util.Scanner ;
public class Social_Experiment_2184A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
          int n = sc.nextInt();
          if(n>=4){
            if(n%2 == 0){
                System.out.println(0);
            }
            else {
                 System.out.println(1);
                }
          }
          else{
            if(n == 2){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
          }
        }
    }
}
