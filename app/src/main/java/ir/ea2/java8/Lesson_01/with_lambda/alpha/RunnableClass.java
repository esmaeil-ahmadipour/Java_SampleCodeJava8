package ir.ea2.java8.Lesson_01.with_lambda.alpha;

public class RunnableClass {
    public static void main(String[] args) {
        //Default Functional Interface (Runnable)
        Runnable runnable = ()-> System.out.println("Run!");
        runnable.run();
    }
}
