/*
Problem: 2203A - TOWER OF BOXES 
Platform: Codeforces
Language: java
*/


import java.util.Scanner ;
public class  Towers_of_Boxes_2203A{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt(),m = sc.nextInt() , d = sc.nextInt();
            int k = 1+d/m;
            int c = 0;
            c = n/k;
            n = n%k;

            if(n >0){
                c++;
            } 
            System.out.println(c);
        }
    }
}