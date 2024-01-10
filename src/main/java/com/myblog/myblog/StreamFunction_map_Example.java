package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunction_map_Example {
    public static void main(String[] args) {
        // Scenario: Given a list of numbers, map each number to its square.
        List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result1 = data1.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(result1);

        //  Given a list of strings, map each string to its length.
        List<String> data2 = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
        List<Integer> result2 = data2.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println(result2);

        // Given a list of Person objects, map each person to their age.
        List<Person> data3 = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 32, "Male"),
                new Person("Charlie", 28, "Male"),
                new Person("Diana", 22, "Female")
        );
        List<Integer> result3 = data3.stream().map(str -> str.getAge()).collect(Collectors.toList());
        System.out.println(result3);
         //Scenario: Given a list of strings, filter out strings that contain the letter 'a'
        // and map the remaining strings to uppercase.

       List<String>data4= Arrays.asList("apple", "banana", "grape", "kiwi", "orange");
        List<String> result4 = data4.stream().filter(str -> str.startsWith("a")).map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(result4);

         // Given a list of numbers, map each number to a string by concatenating it with a prefix.
        List<Integer> data5 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> result5 = data5.stream().map(str ->"Numbers:"+str).collect(Collectors.toList());
        System.out.println(result5);
    }

}
