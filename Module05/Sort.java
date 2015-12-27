/**
 * Created by Андрій on 27.12.2015.
 */
public class Sort {

    public static int[] bulb(int[] array) {
        boolean checker = true;

        while (checker) {
            checker = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                    checker = true;
                }
            }
        }

        return array;
    }

}
