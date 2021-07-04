package javaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        LambdaTest.test();
    }
}

class LambdaTest {
    static void test() {
        List features = Arrays.asList("Alice", "Bob", "Chris", "Dede");
        System.out.println(features);
        features.forEach(str -> System.out.println(str));

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }
}