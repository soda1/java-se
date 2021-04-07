package com.soda.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        Student student1 = new Student(24, "张三");
        Student student2 = new Student(26, "张三");
        Student student3 = new Student(18, "张三");
        Student student4 = new Student(34, "张三");
        Student student5 = new Student(12, "张三");

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);

        List<Student> studentList = list.stream()
                .filter((s) -> {
                    return s.age > 24;
                })
                .collect(Collectors.toList());


        System.out.println(studentList);

    }


}



class Student{

    int age;

    String name;

    public void setAge(int age) {
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
