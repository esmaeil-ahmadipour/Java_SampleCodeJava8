package ir.ea2.java8.Lesson_07;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName(null);
        Optional<String> optional = Optional.ofNullable(user.getName());
        //ifPresent : When value Not Null Then Running This Method!
        optional.ifPresent(s -> {
            if (s != null) {
                System.out.println("Value is :" + s);
            }
        });
        System.out.println(optional.orElse("NUll"));
    }
}
