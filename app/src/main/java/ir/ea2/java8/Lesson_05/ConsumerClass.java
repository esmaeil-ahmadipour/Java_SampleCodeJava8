package ir.ea2.java8.Lesson_05;

import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<HighSchool> highSchoolConsumer =(highSchool) -> highSchool.student();
        highSchoolConsumer.accept(new HighSchool());
    }
}
