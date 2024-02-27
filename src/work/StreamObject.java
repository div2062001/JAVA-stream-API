package work;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //stream api - collection process
        //collection / group of object

        // 1 - blank
        Stream<Object> emptyStream = Stream.empty();

        // 2 - array, object, collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "divya", "sonam"};

        Stream<String> names1 = Stream.of(names);
        names1.forEach(System.out::println);

        // 3
        Stream<Object> build = Stream.builder().build();

        //4
        IntStream stream = Arrays.stream(new int[]{2, 34, 56, 78, 90, 4, 50});
        stream.forEach(System.out::println);

        // 5 - List, Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(3);
        list2.add(89);
        list2.add(68);

        Stream<Integer> stream1 = list2.stream();
        stream1.forEach(System.out::println);

    }
}
