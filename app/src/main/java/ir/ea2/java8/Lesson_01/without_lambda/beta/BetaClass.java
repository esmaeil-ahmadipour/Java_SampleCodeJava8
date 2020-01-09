package ir.ea2.java8.Lesson_01.without_lambda.beta;

public class BetaClass {
    public static void main(String[] args) {
        BetaInterface betaInterface = new BetaInterface() {
            @Override
            public void customMethod(String s, int i) {
                System.out.println(i + " - " + "this is a test for: " + s + ".");
            }
        };
        betaInterface.defaultMethod("default void defaultMethod",1);
        betaInterface.customMethod("public void customMethod",2);
    }
}
