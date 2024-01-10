package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Distinct_Example {
    public static void main(String[] args) {

        // give only distinct record from this list
        // give distinct & sort the record by ascending order
        List<String> data1 = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        List<String> sorted = data1.stream().distinct().collect(Collectors.toList());
        List<String> sortDistinct = data1.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println(sortDistinct);

// remove duplicate people
        // remove duplicate people & print also duplicate people

        List<Person> duplictePeople = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 32, "Male"),
                new Person("Alice", 25, "Female"),
                new Person("Charlie", 28, "Male"),
                new Person("Diana", 22, "Female")
        );


        List<String> result2 = duplictePeople.stream().distinct().map(str -> str.getName()).collect(Collectors.toList());
        System.out.println(result2);
        System.out.println(duplictePeople);
    }
}
