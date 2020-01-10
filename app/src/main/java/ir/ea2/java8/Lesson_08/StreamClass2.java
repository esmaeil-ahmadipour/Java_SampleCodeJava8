package ir.ea2.java8.Lesson_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass2 {
    public static void main(String[] args) {
        //Source  : stringList
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(80);
        list.add(20);
        list.add(50);
        list.add(90);
        list.add(70);
        list.add(10);
        list.add(60);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);

        Stream<Integer> stream = null;

//        SampleOne(stream, list);
//        SampleTwo(stream, list);
//        SampleThree(stream, list);
//        SampleFour(stream, list);
//        SampleFive(stream, list);
//        SampleSix(stream, list);
//        SampleSeven(stream, list);
        SampleEight(stream, list);

    }

    private static void SampleEight(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
        Optional optional =stream.sorted((t1, t2) -> (t1 - t2))
                //If  Condition Not Matched :return True / otherWise:return False
                .skip(1)
                .findFirst();
        //In Empty Stream Not Have Exception.
        optional.ifPresent(s->System.out.println(s));

    }

    private static void SampleSeven(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
        boolean check200NoneMatch=stream.sorted((t1, t2) -> (t1 - t2))
                //If  Condition Not Matched :return True / otherWise:return False
                .noneMatch(item->(item==200));

        System.out.println(check200NoneMatch);
    }

    private static void SampleSix(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
        boolean checkAll100=stream.sorted((t1, t2) -> (t1 - t2))
                //Skip 10 First Items.
                .skip(10)
                //If All Items Matched by this condition:return True / otherWise:return False
                .allMatch(item->(item==100));

        System.out.println(checkAll100);
    }

    private static void SampleFive(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
       boolean check50=  stream.sorted((t1, t2) -> (t1 - t2))
                //Remove Duplicate Items.
                .distinct()
                //Find One Or More Items by this condition:return True / Not Found:return False
                .anyMatch(item->(item==50));
        System.out.println(check50);
    }

    private static void SampleFour(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
        List streamedList = stream.sorted((t1, t2) -> (t2 - t1))
                //Change ValueType
                .map(item -> (item.doubleValue()))
                //Remove Duplicate Items.
                .distinct()
                //items Under 50 ,Remove From Stream Result.
                .filter(item -> (item >= 50))
                //Convert Stream To List.
                .collect(Collectors.toList());

        //Print All Items From Streamed List .
        streamedList.stream().forEach(item->System.out.println(item));
    }

    private static void SampleThree(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
        Long counter = stream.sorted((t1, t2) -> (t1 - t2))
                //Change ValueType
                .map(item -> (item.doubleValue()))
                //Remove Duplicate Items.
                .distinct()
                //Count Items.
                .count();

        System.out.println("COUNTER: " + counter);


    }

    private static void SampleTwo(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();

        //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
        stream.sorted((t1, t2) -> (t1 - t2))
                //Change ValueType
                .map(item -> (item.doubleValue()))
                //Remove Duplicate Items.
                .distinct()
                //Print All Items.
                .forEach(System.out::println);

    }

    private static void SampleOne(Stream<Integer> stream, List<Integer> list) {
        stream = list.stream();
        //items Under 50 ,Remove From Stream Result.
        stream.filter(item -> (item >= 50))
                //SortBy DESC:(t2 - t1) & SortBy ASC:(t1 - t2)
                .sorted((t1, t2) -> (t2 - t1))
                //Result Limit : 4 Items .
                .limit(4)
                //Skipped Result: 2 Items .
                .skip(2)
                //Print All Items.
                .forEach(System.out::println);

    }
}
