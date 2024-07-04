package Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");

        List<String> result1 = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .toList();
        System.out.println(result1);

        List<String> result2 = words.stream()
                .map(word -> word + "님")
                .toList();
        System.out.println(result2);
    }
}