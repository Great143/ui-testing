package paramTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParamTest {
    @ParameterizedTest
    @MethodSource("paramTest.Data#getNames")
    public void stratParamTest(String param) {
        System.out.println(param);
    }
}
