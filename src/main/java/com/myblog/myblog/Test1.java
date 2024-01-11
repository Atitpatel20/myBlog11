package com.myblog.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Student> marks = Arrays.asList(
                new Student("kalpesh", 85, "A"),
                new Student("nikesh", 65, "B"),
                new Student("yatin", 75, "B+"),
                new Student("rahul", 95, "A+"),
                new Student("roshan", 85, "A")
        );
        Map<Integer, List<Student>> result = marks.stream().collect(Collectors.groupingBy(x -> x.getMarks()));
        for ( Map.Entry<Integer,List<Student>> res: result.entrySet()) {
            Integer mark = res.getKey();
            List<Student> value = res.getValue();
            System.out.println("marks:"+mark+"---");
            for (Student  m: value) {
                System.out.println(m.getName());
                System.out.println(m.getGrade());
            }

        }
    }
}
