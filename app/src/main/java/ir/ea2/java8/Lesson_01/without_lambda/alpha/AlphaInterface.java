package ir.ea2.java8.Lesson_01.without_lambda.alpha;

public interface AlphaInterface {
    default void defaultMethod(){
        System.out.println("this is a test for: default void defaultMethod().");
    }
    void customMethod();
}
