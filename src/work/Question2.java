package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = list.stream();

        List<Integer> collect = stream.filter(i -> i % 2 == 0).map(e->e*10).collect(Collectors.toList());
            System.out.println(collect);
            System.out.println("Question solved" );

    }
}
