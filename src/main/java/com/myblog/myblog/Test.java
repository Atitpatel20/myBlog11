package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
// Q-1 find the length of given string
//        Predicate<String> val=str-> str.length()>5;
//        boolean result1 = val.test("example");
//        System.out.println(result1);
//
       // Q-2 find the string has contain a of given string
//      Predicate<String> data= str->str.contains("a");
//        boolean result2 = data.test("banana");
//        System.out.println(result2);
//
       // Q-3 find the string os emplty or not  of given string
//        Predicate<String>data1= str-> str.isEmpty();
//        boolean result3 = data1.test("testing");
//        System.out.println(result3);
//
//        // map example
//
//        // Q-1 find the length of given string
//       Function<String,Integer> data4= str->str.length();
//        Integer result4 = data4.apply("keshav");
//        System.out.println(result4);
//
//        //Q-2 add value in +10 to any value and give the output
//       Function<Integer,Integer>data5= i->i+10;
//        Integer result5 = data5.apply(26);
//        System.out.println(result5);
//
//        // Q-3 add 20 with all numbers in given list(10,25,39,14,25)
//        List<Integer> numbers = Arrays.asList(10, 25, 39, 14, 25);
//        List<Integer> result = numbers.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(result);

        // How would you handle potential exceptions in a lambda expression?
                Function<String, Integer> safeLength = str -> {
                    try {
                        return str.length();
                    } catch (NullPointerException e) {
                        return 0; // Handle the exception by returning a default value.
                    }
                };

                // Example usage
                String inputString = "example";
                Integer result = safeLength.apply(inputString);
                System.out.println(result);
            }
        }


