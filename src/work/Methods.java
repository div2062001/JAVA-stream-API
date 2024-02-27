package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {
        //filter(predicate)
            //predicate -: boolean valued function
            //lambda -: e->e>10


        //map(Function)
        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Divya", "Kajal");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);


        List<Integer> nums = List.of(2, 3, 4, 5, 6, 7);
        List<Integer> newNums = nums.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNums);

        //sort
        nums.stream().sorted().forEach(System.out::println);

       // min
        Integer i = nums.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(i);

        //max
        Integer newNum = nums.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(newNum);
    }
}
