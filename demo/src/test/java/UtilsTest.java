import com.epam.demo.Utils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class UtilsTest {

    @Test
    public void testIsAllPositiveNumbers_AllPositiveNumbers() {
        List<String> numbers = Arrays.asList("1", "2", "3");
        assertTrue(Utils.isAllPositiveNumbers(numbers));
    }

    @Test
    public void testIsAllPositiveNumbers_NegativeNumber() {
        List<String> numbers = Arrays.asList("1", "-2", "3");
        assertFalse(Utils.isAllPositiveNumbers(numbers));
    }

    @Test
    public void testIsAllPositiveNumbers_NotANumber() {
        List<String> numbers = Arrays.asList("1", "2", "three");
        assertFalse(Utils.isAllPositiveNumbers(numbers));
    }

}