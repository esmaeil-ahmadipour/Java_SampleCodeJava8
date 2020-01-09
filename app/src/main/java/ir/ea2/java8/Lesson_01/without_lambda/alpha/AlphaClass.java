package ir.ea2.java8.Lesson_01.without_lambda.alpha;

public class AlphaClass {
    public static void main(String[] args) {
        AlphaInterface customInterface = new AlphaInterface() {
            @Override
            public void customMethod() {
                System.out.println("thiss is a test for: public void customMethod()");
            }

        };
        customInterface.customMethod();
        customInterface.defaultMethod();
    }
}