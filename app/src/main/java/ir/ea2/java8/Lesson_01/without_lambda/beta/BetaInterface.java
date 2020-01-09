package ir.ea2.java8.Lesson_01.without_lambda.beta;

public interface BetaInterface{
    default void defaultMethod(String s, int i) {
        System.out.println(i + " - " + "this is a test for: " + s + ".");
    }

    void customMethod(String s, int i);
}
