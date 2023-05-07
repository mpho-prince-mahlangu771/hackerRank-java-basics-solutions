import java.util.*;
import java.io.*;
import java.math.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int series = a + ((int) Math.pow(2, 0) * b);
            for(int j=0; j< n; j++) {
                System.out.printf("%d ", series);
                series = series + ((int) Math.pow(2, j+1) * b);
            }
            System.out.println("");
        }
        in.close();
    }
}
