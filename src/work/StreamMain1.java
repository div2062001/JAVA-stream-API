package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        
        //create a list and filter all even numbers from list
        List<Integer> list1 = List.of(2, 3, 23, 45, 6, 7, 88);     //immutable list

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(3);
        list2.add(89);
        list2.add(68);

        List<Integer> list3 = Arrays.asList(2, 3, 23, 45, 61, 72, 88);

    //without stream

        List<Integer> listEven = new ArrayList<>();

        for(Integer i: list1)
        {
            if(i%2 == 0){
                listEven.add(i);
            }
        }


    //with stream api - list 2
        Stream<Integer> stream = list2.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());


        //list 3
        List<Integer> newList1 = list3.stream().filter(i -> i>50).collect(Collectors.toList());

        System.out.println(listEven);
        System.out.println(newList);
        System.out.println(newList1);

    }
}
