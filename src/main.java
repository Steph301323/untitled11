import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(array);
        for (int number : array)
            if (number % 2 == 0 & number >0 )
                System.out.println(number);





    }
}