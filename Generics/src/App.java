public class App {
    public static void main(String[] args) throws Exception {
        //using primitive type(int) gives an error
        Integer[] num_arr = {1,2,3};
        String[] str_arr = {"Hello", "World"};

        printArray(num_arr);
        printArray(str_arr);
    }

    public static <T> void printArray(T[] arr) {
        for(T t: arr) {
            System.out.println(t);
        }
    }
}
