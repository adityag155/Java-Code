import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        Shuffle(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    private static void Shuffle(Integer[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length * 2; i++) {
            int index1 = random.nextInt(array.length);
            int index2 = random.nextInt(array.length);

            Integer temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }
}