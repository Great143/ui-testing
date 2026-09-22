import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

        @Test
        public void test() {
            System.out.println("Email");
            Assertions.assertEquals("Hello", "Hello");
            Assertions.assertNotEquals("11", "12");
            Assertions.assertAll(
                    () -> Assertions.assertThrows(RuntimeException.class, () -> {
                        throw new RuntimeException("Test");
                    }),
                    () -> Assertions.assertEquals("Hello", "Hello")
            );
        }
    }

