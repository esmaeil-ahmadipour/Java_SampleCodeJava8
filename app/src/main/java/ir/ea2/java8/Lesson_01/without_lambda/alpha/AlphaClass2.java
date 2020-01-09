package ir.ea2.java8.Lesson_01.without_lambda.alpha;

public class AlphaClass2 implements AlphaInterface {
    public static void main(String[] args) {

        AlphaClass2 class2 = new AlphaClass2();
        class2.customMethod();
        class2.defaultMethod();
    }

    @Override
    public void customMethod() {
        System.out.println("this is test for : public void customMethod()");
    }

}