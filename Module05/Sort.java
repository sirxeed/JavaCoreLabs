/**
 * Created by Андрій on 27.12.2015.
 */
public class Sort {

    public static int[] bulb(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }

        return array;
    }

}
