import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String s;
        Scanner scan = new Scanner(System.in); 
            System.out.print("Enter your string: ");
            s = scan.nextLine();
            scan.close();

        //check input,  if its blank, then, there no tokens, that is , the number of tokens = 0

        if(s.isBlank()) System.out.println(0);

        else {
            String tokens[] = s.strip().split("[\\s!,?._'@]+");

            System.out.println("\n Number of token from your string: " + tokens.length);

            for (int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i] + "test");
            }
        }
    }
}
