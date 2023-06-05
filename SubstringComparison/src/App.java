import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //arr len = 13(0-12)
        /*
         * i=0{w} 0+3 = 3[wel]
         * i=1{e} 1+3=4 [elc]
         * i=2{l} 2+3=5 [lco]
         * i=3{c} 3+3=6 [com]
         * i=4{o} 4+3=7 [ome]
         * i=5{m} 5+3=8 [met]
         * i=6{e} 6+3=9 [eto]
         * i=7{t} 7+3=10 [toj]
         * i=8{o} 8+3=11 [oja]
         * i=9{j} 9+3=12 [jav]
         * i=10{a} 10+3=13 [ava] - substring(i)
         * [elc, lco, com, ome, met, eto, toj, oja, jav, ava,10,11,12] = len 10
         * 
         * len= 10
         * i=0{c} 0+3=3 [com]
         * i=1{o} 1+3=4 [omp]
         * i=2{m} 2+3=5 [mpa]
         * i=3{p} 3+3=6 [par]
         * i=4{r} 4+3=7 [rab]
         * i=5{a} 8 [abl]
         * i=6{b} 9 [ble]
         * [com, omp, mpa, par, rab, abl, ble,7, 8,9 ] = len 7
         */
        System.out.println(getSmallestAndLargest("welcometojava", 03));
        System.out.println(getSmallestAndLargest("Comparable", 3));
        System.out.println(getSmallestAndLargest("welcometojava", 04));
        System.out.println(getSmallestAndLargest("amehlo", 03));
        System.out.println(gsl("welcometojava", 03));
        System.out.println(gsl("welcometojava", 03));


    }

    public static String gsl(String s, int k) {
        //sub_arr[13]
        String s_sub_arr[] = new String[s.length() - 2];

        for (int i = 0; i < s.length(); i ++) {
            //13-3=10
            if (i == s.length() - 3) {
                s_sub_arr[i] = (s.substring(i));
                break;
            } else {
                s_sub_arr[i] = s.substring(i, i + k);
            }

        }
        Arrays.sort(s_sub_arr);
        String smallest = s_sub_arr[0];
        String largest = s_sub_arr[s_sub_arr.length - 1];
        return smallest + "\n" + largest;
    } 
    public static String getSmallestAndLargest(String s, int k) {
        
        ArrayList<String> s_substring_arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (i == s.length() - 3) {
                s_substring_arr.add(s.substring(i));
                break;
            } else {
                s_substring_arr.add(s.substring(i, i + k));
            }
        }
        Collections.sort(s_substring_arr);
        String smallest = s_substring_arr.get(0);
        String largest = s_substring_arr.get(s_substring_arr.size() - 1);
        return smallest + "\n" + largest;
    }
}
