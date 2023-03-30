import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 6, 4, 4, 3, 7, 8};
        int[] array2 = {1, 5, 6};
        int[] array3 = null;

        System.out.println(Arrays.toString(workArray1(Arrays.stream(array1).toArray())));
        System.out.println(Arrays.toString(workArray1(Arrays.stream(array2).toArray())));
        System.out.println(Arrays.toString(workArray1(Arrays.stream(array3).toArray())));
    }

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
            if (a < 1) throw new RuntimeException ("No number 4 in array");
        } catch (ArithmeticException ignored) {

        }
        return newArray;
    }
    public static boolean workArray2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i : arr) {
            if (i != 1 && i != 4) return false;
        }
        return true;
    }
}



