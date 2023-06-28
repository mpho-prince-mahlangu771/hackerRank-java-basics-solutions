import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      String a;
      String b;
      
      try (Scanner scan = new Scanner(System.in)) {
         System.out.print("Enter string a: ");
         a = scan.next().toLowerCase();

         System.out.print("\n Enter string b: ");
         b = scan.next().toLowerCase();
      }

      System.out.println(a.compareToIgnoreCase(b));
      boolean anagramChecker = isAnagram(a, b);
     if(anagramChecker) System.out.println("Anagrams");
     else System.out.println("Not Anagrams");

    }

    public static boolean isAnagram(String a, String b) {
         char[] arr_a = a.toCharArray();
         char[] arr_b = b.toCharArray();

         Arrays.sort(arr_a);
         Arrays.sort(arr_b);

         String a_sorted = new String(arr_a);
         String b_sorted = new String(arr_b);

         if((a_sorted.compareToIgnoreCase(b_sorted)) == 0) return true;
         else return false;
         // Arrays.sort(a.toCharArray());
         // Arrays.sort(b.toCharArray());

    }
}
