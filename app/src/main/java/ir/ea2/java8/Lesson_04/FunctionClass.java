package ir.ea2.java8.Lesson_04;

import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {
        FunctionApply();
        FunctionalAndThen();
        FunctionalCompose();
        FunctionalIdentity(5);
        System.out.println( "Result Function.identity(): "+FunctionalIdentity(70));
    }

    private static int FunctionalIdentity(int integer) {
        //This Function Just Return Input Value
        Function<Integer, Integer> id = Function.identity();
       int result =id.apply(integer);
        return result;
    }

    private static void FunctionalCompose() {
        int numberSelected =3;
        Function<Integer, Integer> multiply = (value) -> (value) * 2;
        Function<Integer, Integer> add = (value) -> (value) + 3;
       /*
        * Input Of Add : From Input Of Apply.
        * Input Of multiply : From Return Of Add.
        * Return multiply  is Final Result.
        */
        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        Integer result = addThenMultiply.apply(numberSelected);
        System.out.println("Result addThenMultiply :" + result);
    }

    private static void FunctionalAndThen() {
        char characterValue = 'A';
        Function<Character, Integer> castCharToInt = (character) -> (int) character;
        Function<Integer, Boolean> equalSixtyFive = (integer) -> integer == 65;

        boolean result = castCharToInt.andThen(equalSixtyFive).apply(characterValue);
        System.out.println("'" + characterValue + "' Cast To Integer , Is equal to 65 ? " + result);
    }

    private static void FunctionApply() {
        char characterValue = 'A';
        Function<Character, Integer> castCharToInt = (character) -> (int) character;
        int result = castCharToInt.apply(characterValue);
        System.out.println("Cast '" + characterValue + "' To Integer = " + result);
    }
}
