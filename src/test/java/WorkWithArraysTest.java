import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkWithArraysTest {
    int[] array1 = {1, 5, 6, 4, 4, 3, 7, 8};
    int[] array2 = {1, 5, 6};
    int[] array3 = null;

    int[] array4 = {1, 1, 1, 4, 4, 1, 4, 4};
    int[] array5 = {1, 1, 1, 1, 1};
    int[] array6 = {4, 4, 4, 4, 4};
    int[] array7 = {1, 4, 4, 1, 1, 4};
    int[] array8 = {3, 2, 6, 8, 9, 5};



    @Test()
    void testArray1() {
        Assertions.assertArrayEquals(new int[]{3, 7, 8}, WorkWithArrays.workArray1(array1));
    }

    @Test()
    void testArray2() {
        Assertions.assertThrows(RuntimeException.class, () -> WorkWithArrays.workArray1(array2));
    }

    @Test()
    void testArray3() {
        Assertions.assertNull(array3);
    }

    @Test()
    void testArray4() {
        Assertions.assertTrue(WorkWithArrays.workArray2(array4));
    }

    @Test()
    void testArray5(){
        Assertions.assertFalse(WorkWithArrays.workArray2(array5));
    }

    @Test()
    void testArray6(){
        Assertions.assertFalse(WorkWithArrays.workArray2(array6));
    }

    @Test()
    void testArray7() {
        Assertions.assertTrue(WorkWithArrays.workArray2(array7));
    }
    @Test()
    void testArray8(){
        Assertions.assertFalse(WorkWithArrays.workArray2(array8));
    }


}
