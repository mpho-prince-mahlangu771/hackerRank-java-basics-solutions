import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
                try (/*
                 * I used a stringBuilder because of it's mutability 
                 * instead of declaring & initializing : StringBuilder A_reversed = new StringBuilder(A);
                 * then reversing the object: A.reverse()
                 * then converting it into a string again: A_reversed.toString()
                 * I saw it more efficient to do it all in one line
                 */
        Scanner sc = new Scanner(System.in)) {
            String A;
            String A_reversed ;

            System.out.println("====== Is your string a palindrome? let's find out! ====== \n");
            System.out.print("Enter your string to find out: ");
            A=sc.next();

            System.out.println("\n You entered the string : " + A);
            System.out.println("\n calculating...");

            A_reversed = new StringBuilder(A).reverse().toString();
            
            if(A.equals(A_reversed)) {
                System.out.format("\n Yes... the string: (%s) is indeed a palindrome!", A);
            } else {
                System.out.format("\n Oh-no... the string: (%s) is not a palindrome! \n", A);
            }
        }

        

    }
}
