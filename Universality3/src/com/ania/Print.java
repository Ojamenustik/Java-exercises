package com.ania;

import java.util.Arrays;
import java.util.List;

interface IPrint{
    void print(List<Integer>p);
}

public class Print {

    public static void run(){
        IPrint lambda = (List<Integer> p) -> {p.stream().forEach(System.out::println);};
        List<Integer> l = Arrays.asList(46, 83, -36, 64, 2, -67);
        lambda.print(l);
    }
}
