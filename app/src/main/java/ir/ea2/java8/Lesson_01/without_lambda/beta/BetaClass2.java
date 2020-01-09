package ir.ea2.java8.Lesson_01.without_lambda.beta;

public class BetaClass2 implements BetaInterface {
    public static void main(String[] args) {

        BetaClass2 class2 = new BetaClass2();
        class2.defaultMethod("default void defaultMethod",1);
        class2.customMethod("public void customMethod",2);
    }

    @Override
    public void customMethod(String s, int i) {
        System.out.println(i + " - " + "this is a test for: default " + s + ".");
    }
}
