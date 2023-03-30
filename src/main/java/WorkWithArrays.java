import java.util.Arrays;

public class WorkWithArrays {
    public static int[] workArray1(int[] array) {
        if (array == null) {
            return null;
        }
        int a = 0;
        int[] newArray = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                a = array[i];
                newArray = new int[array.length - i - 1];
                for (int x = i + 1, y = 0; x < array.length; x++, y++) {
                    newArray[y] = array[x];
                }
            }
        }
        try {
            if (a < 1) throw new RuntimeException("No number 4 in array");
        } catch (ArithmeticException ignored) {

        }
        return newArray;
    }

    public static boolean workArray2 (int[] array) {
        int first = 1;
        int second = 4;
        boolean containsFirst = false;
        boolean containsSecond = false;
        for (int element : array) {
            if (element == first) {
                containsFirst = true;
            } else if (element == second) {
                containsSecond = true;
            }
        }
        return containsFirst && containsSecond;
    }
}






