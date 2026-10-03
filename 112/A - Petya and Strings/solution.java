import java.io.*;
 
public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine().toLowerCase();
        String b = r.readLine().toLowerCase();
        int c = a.compareTo(b);
        if (c < 0) System.out.println(-1);
        else if (c > 0) System.out.println(1);
        else System.out.println(0);
    }
}