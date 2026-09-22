import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 23, 4, 45, 2);
        System.out.println(numbers);
        numbers.stream()
                .filter(x -> x >5).sorted(Comparator.reverseOrder()).map(x -> x * x ).collect(Collectors.toList());
        System.out.println(numbers.stream().filter(x -> x >5).sorted(Comparator.reverseOrder()).map(x -> x * x ).collect(Collectors.toList()));
    }
}
