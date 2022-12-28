import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {
    //class:App variables declarations
    static int B, H;
    static boolean flag;

    //my static block
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;

        } else {
            flag = true;
        }
    }
    public static void main(String[] args) throws Exception {
        		if(flag){
                    int area=B*H;
                    System.out.print(area);
                }
    }
}
