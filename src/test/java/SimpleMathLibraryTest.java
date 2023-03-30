import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class SimpleMathLibraryTest {

    @Test()
    void addShouldEqualGivenNumber() {
        Assertions.assertEquals(12.39, SimpleMathLibrary.add(5.52, 6.87));
        Assertions.assertEquals(15.21, SimpleMathLibrary.add(15.0, 0.21), 0.01);
    }

    @Test()
    void minusShouldEqualGivenNumber() {
        Assertions.assertEquals(10.11, SimpleMathLibrary.minus(20.11, 10.00));
        Assertions.assertEquals(15.21, SimpleMathLibrary.minus(16.0, 0.78), 0.01);
    }


}
