package com.soda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

public class CollectorTest<T,A,R>  implements Collector<T,A,R> {

    private Supplier<A> supplier;
    private BiConsumer<A, T> accumulator;
    private BinaryOperator<A> combiner;

    public CollectorTest(Supplier<A> supplier, BiConsumer<A, T> accumulator, BinaryOperator<A> binaryOperator) {
        this.supplier  = supplier;
        this.accumulator = accumulator;
        this.combiner = binaryOperator;
    }


    @Override
    public Supplier<A> supplier() {
        return supplier;
    }

    @Override
    public BiConsumer<A, T> accumulator() {
        return accumulator;
    }

    @Override
    public BinaryOperator<A> combiner() {
        return combiner;
    }

    @Override
    public Function<A, R> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }


    public static void main(String[] args) {

        CollectorTest<Student, List<Student>, List<Student>> collectorTest =
                new CollectorTest<>(ArrayList::new, (students, student) -> students.add(student), (left, right) -> {
            left.addAll(right);
            return left;
        });

        BiConsumer< List<Student>, Student> biConsumer = List::add;

        List list = new ArrayList<Student>();
        biConsumer.accept(list, new Student(17, "lisi"));
        biConsumer.accept(list, new Student(17, "wangwu"));
        System.out.println(list);
    }


}



