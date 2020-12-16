package com.java8to11.chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.toString());
        }

        OnlineClass onlineClass = optional.get();
        System.out.println(onlineClass.getTitle());

        optional.ifPresent(oc -> System.out.println(oc.getTitle()));

        OnlineClass onlineClass1 = optional.orElse(createNewClass()); // orElse() : null 인 경우 (상관없이 무조건 발생)
        System.out.println(onlineClass1.getTitle());

        OnlineClass onlineClass2 = optional.orElseGet(App::createNewClass); // orElse() : null 인 경우
        System.out.println(onlineClass2.getTitle());

        OnlineClass onlineClass3 = optional.orElseThrow(IllegalArgumentException::new);
        System.out.println(onlineClass3.getTitle());

        Optional<OnlineClass> onlineClass4 = optional.filter(OnlineClass::isClosed);
        System.out.println(onlineClass4.isPresent());

        Optional<Integer> integer = optional.map(OnlineClass::getId);
        System.out.println(integer.isPresent());

        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress); // flatMap()
        Progress progress1 = progress.orElseThrow();

    }

    private static OnlineClass createNewClass() {
        System.out.println("\"New class\"");
        return new OnlineClass(10, "New class", false);
    }

}
