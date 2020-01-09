package ir.ea2.java8.Lesson_03;

import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        PredicateTest();
        PredicateAnd();
        PredicateOr();
        PredicateNegate();

    }

    private static void PredicateNegate() {
        String stringValue = "A";
        Predicate<String> checkNotEmpty = (string) -> !string.isEmpty();
        boolean predicateNegate  = checkNotEmpty.negate().test(stringValue);
        System.out.println("Negate (NotEmpty) FOR '" + stringValue + "' :" + predicateNegate);
    }

    private static void PredicateOr() {
        String stringValue = "ABCDEFGHIJKLMNOP";
        Predicate<String> checkNotEmpty = (string) -> !string.isEmpty();
        Predicate<String> checkLengthUnderTen = (string) -> string.length() <= 10;
        boolean predicateOr = checkNotEmpty.or(checkLengthUnderTen).test(stringValue);
        System.out.println("(NotEmpty) Or (Length Under 10) For '" + stringValue + "' :" + predicateOr);

    }

    private static void PredicateAnd() {
        String stringValue = "ABCDEFGHIJ";
        Predicate<String> checkNotEmpty = (string) -> !string.isEmpty();
        Predicate<String> checkLengthUnderTen = (string) -> string.length() <= 10;
        boolean predicateAnd = checkNotEmpty.and(checkLengthUnderTen).test(stringValue);
        System.out.println("(NotEmpty) And (Length Under 10) For '" + stringValue + "' :" + predicateAnd);
    }

    private static void PredicateTest() {
        int numberForCheck = 5;
        Predicate<Integer> equalToFive = (i) -> i == 5;
        boolean valueCheck = equalToFive.test(numberForCheck);
        System.out.println(numberForCheck + " equalToFive ? " + valueCheck);

    }
}
