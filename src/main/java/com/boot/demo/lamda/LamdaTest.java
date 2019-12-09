package com.boot.demo.lamda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LamdaTest {
    public static void main(String args[]){
        Shape s1 = new Shape("BLUE", new BigDecimal("1.111"));
        Shape s2 = new Shape("BLUE", new BigDecimal("10"));
        Shape s3 = new Shape("YELLO", new BigDecimal("20.1"));
        Shape s4 = new Shape("GREEN", new BigDecimal("100"));

        List<Shape> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Map<String, List<Shape>> map = list.stream()
                .collect(Collectors.groupingBy(Shape::getColor));


        //BigDecimal sum        Collectors.reducing(BigDecimal::add)
         //       .reduce(BigDecimal::add).get();
        //System.out.println(sum.toString());
    }

    public void distinctPrimary(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        List<Integer> r = l.stream()
                .map(e -> new Integer(e))
                .filter(e -> e.equals(1))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctPrimary result is: " + r);
    }

    public void primaryOccurrence(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        Map<Integer, Integer> r = l.stream()
        .map(e -> new Integer(e))
        .filter(e -> e.equals(1))
        .collect( Collectors.groupingBy(p->p, Collectors.summingInt(p->1)) );
        System.out.println("primaryOccurrence result is: " + r);
    }


}
