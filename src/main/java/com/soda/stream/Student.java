package com.soda.stream;

/**
 * @author soda
 * @date 2021/8/1
 */
public class Student {
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
