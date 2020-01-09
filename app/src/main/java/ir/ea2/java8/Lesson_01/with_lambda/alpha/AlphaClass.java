package ir.ea2.java8.Lesson_01.with_lambda.alpha;

public class AlphaClass {
    public static void main(String[] args) {
        AlphaInterface alphaInterface = ()->System.out.println("this is a test for: public void customMethod()");

        alphaInterface.defaultMethod();
        alphaInterface.customMethod();
    }
}