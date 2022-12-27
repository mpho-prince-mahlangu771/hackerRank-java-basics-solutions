import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int counter = 1;
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()) {
            //consume and advance  the token
            String input = scan.nextLine();
            System.out.printf("%d %s", counter, input);
            System.out.println();
            counter++;
        }
    }
}
