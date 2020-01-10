package ir.ea2.java8.Lesson_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass1 {
    public static void main(String[] args) {
        //Source  : stringList
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Stream stream = list.stream();
        //stream.forEach(item -> System.out.println(item));
        stream.forEach(System.out::println);

    }
}
