import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
 class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tmpStr;
        int tmpInt;
        String str = "";
        int x = -1;
        boolean flag = true;
        Map<String, Integer> userInputs = new HashMap();


        System.out.println("\n******Enter 3 strings and 3 numbers****** \n".toUpperCase());

        for (int i=0; i <3; i++) {
            while(flag) {
                System.out.format("\nEnter  a string : ");

                tmpStr = sc.next();

                if(tmpStr.length() > 10 || tmpStr.isBlank()) {
                    //print error message and prevent user from moving on until valid inp given
                    System.out.println("Invalid input - The string must be maximum of 10 characters\n");
                } else {
                    str = tmpStr;
                    flag = false;
                }
            }

            flag = true;

            while(flag) {
                System.out.print("\nEnter a number(maximum of 3 digits): ");

                try {

                    tmpInt = sc.nextInt();

                    if(tmpInt < 0 || tmpInt > 999) {
                        System.out.println("Invalid number - The number between 0 and 999\n");
                    } else {
                        x = tmpInt;
                        flag = false;
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("\n\nInvalid input format - The input received is not a number\n");
                    sc.next();
                }
            }
            flag = true;

            System.out.println("\n");

            userInputs.put(str, x);
        }
        
        //applying formatting
        System.out.println("\n====================================");
        for(Map.Entry<String, Integer> entry: userInputs.entrySet()) {
            System.out.format("%-15s %03d \n", entry.getKey(), entry.getValue());
        }
        System.out.println("================================");
    }
}
