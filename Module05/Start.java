import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Андрій on 27.12.2015.
 */
public class Start {
    public static void main(String[] args) {
        //Створимо масив заданого розміру
        int arraySize = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //arraySize = Integer.parseInt(reader.readLine());

        while (arraySize <= 0) {
            System.out.print("Enter array size: ");
            try {
                try {
                    arraySize = Integer.parseInt(reader.readLine());
                } catch (IOException e) {
                    System.out.println("Please enter a value: ");
                }
            } catch (NumberFormatException f) {
                System.out.println("Entered value is not a digit");
            }
        }


        int[] array = new int[arraySize];

        //Заповнимо масив довільними значеннями
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 200);
        }

        //Виконаємо сортування за зростанням методом бульбашки
        array = Sort.bulb(array);

        //Роздрукуємо усі елементи масиву
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
