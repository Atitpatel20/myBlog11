package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sorting_Example {
    public static void main(String[] args) {
        //Q-1 sort the elements numbers of a stream in ascending order first & then descending order
        List<Integer> data1 = Arrays.asList(5, 2, 8, 1, 6, 3, 7, 4);
        List<Integer> sortedNumbers = data1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers: "+sortedNumbers);

// sort the elements numbers in descending order
        List<Integer> reverseNumbers = data1.stream().sorted((s1, s2) -> Integer.compare(s2, s1)).collect(Collectors.toList());
        System.out.println("Reverse Numbers: "+reverseNumbers);

        // Q-2 sort the elements numbers of a stream in ascending order first & then descending order
        List<String> data2 = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        List<String> sortedFruits = data2.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Fruits: "+sortedFruits);

        List<String> reverseFruits = data2.stream().sorted((a1, a2) -> a2.compareTo(a1)).collect(Collectors.toList());
        System.out.println("Reverse Fruits:"+reverseFruits);

        // Q-3 sort by first age ascending order
        // sort by second age descending order
        // sort by third name ascending order

        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 32, "Male"),
                new Person("Charlie", 28, "Male"),
                new Person("Diana", 22, "Female")
        );

        List<Person> result4 = people.stream().sorted((c1, c2) -> Integer.compare(c1.getAge(), c2.getAge())).collect(Collectors.toList());
        List<Person> result5 = people.stream().sorted((c1, c2) -> Integer.compare(c2.getAge(), c1.getAge())).collect(Collectors.toList());
        List<Person> result6 = people.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).collect(Collectors.toList());
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }

}
