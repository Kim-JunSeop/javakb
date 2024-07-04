package Q2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> greaterThanThree = numbers.stream()
                .filter(n -> n > 3)
                .collect(Collectors.toList());

        System.out.println(greaterThanThree);

        List<Integer> multipliedByTen = numbers.stream()
                .map(n -> n * 10)
                .collect(Collectors.toList());

        System.out.println(multipliedByTen);
    }
}
