package ir.ea2.java8.Lesson_02;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        CustomInterface customInterface;

        //Reference To Constructor :
        customInterface = Test::new;


        //Reference To Method :
        customInterface = test::sayHello;
        printLn(customInterface);

        customInterface = Test::sayNumberOne;
        printLn(customInterface);

        String stringValue = "";
        StringCheck stringCheck = stringValue::isEmpty;
        System.out.println("stringValue isEmpty ? " + stringCheck.checkString());


    }

    private static void printLn(CustomInterface objectCustomInterface) {
        System.out.println(objectCustomInterface.customMethod());
    }
}
