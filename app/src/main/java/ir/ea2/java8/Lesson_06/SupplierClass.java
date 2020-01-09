package ir.ea2.java8.Lesson_06;

import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<User> userSupplier = User::new;
        userSupplier.get();
    }
}
