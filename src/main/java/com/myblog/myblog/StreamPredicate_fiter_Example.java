package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPredicate_fiter_Example {
    public static void main(String[] args) {
        // Given a list of strings, filter out strings with a length less than 5.
        List<String> data1 = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
        List<String> result1 = data1.stream().filter(str -> str.length() < 5).collect(Collectors.toList());
        System.out.println(result1);

        // Given a list of integers, filter out the even numbers.
        List<Integer> data2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result2 = data2.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(result2);

       // Given a list of Person objects, filter out persons older than 30.
        List<Person> data3 = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 32, "Male"),
                new Person("Charlie", 28, "Male"),
                new Person("Diana", 22, "Female")
        );
        List<Person> result3 = data3.stream().filter(str -> str.getAge() <= 30).collect(Collectors.toList());
        System.out.println(result3);

        // Given a list of strings, filter out strings starting with the letter 'a'.
        List<String>  data4= Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
        List<String> result4 = data4.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());
        System.out.println(result4);

        // Given a list of Person objects, filter out females.
List<Person>data5=Arrays.asList(
        new Person("Alice", 25, "Female"),
        new Person("Bob", 32, "Male"),
        new Person("Charlie", 28, "Male"),
        new Person("Diana", 22, "Female")
);
        List<Person> result5 = data5.stream().filter(str -> str.getGender().equals("Male")).collect(Collectors.toList());
        System.out.println(result5);

        // Scenario: Filter a list of integers to include only those between 20 and 50.
        List<Integer> data6 = Arrays.asList(10, 20, 25, 30, 35, 40, 50, 60, 70);
        List<Integer> result6 = data6.stream().filter(i -> i >= 20 && i <= 50).collect(Collectors.toList());

        // Combine two conditions to filter out strings starting with "A" and having a length greater than 3.
        List<String>data7=Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
        List<String> result7 = data7.stream().filter(str -> str.startsWith("a") && str.length() > 3).collect(Collectors.toList());
        System.out.println(result7);

    }

}
