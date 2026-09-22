package paramTest;

import java.util.stream.Stream;

public class Data {

    public static Stream<String> getNames() {
        return Stream.of("Петя", "Вася", "Саша");
    }
}
