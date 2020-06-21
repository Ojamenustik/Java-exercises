package com.ania;

import java.util.stream.Stream;

interface ISummer{
    void sum();
}

public class Summer {

    public static void run(){
        ISummer lambda2 = () -> {
            System.out.println(Stream.of(11, -2, 42, -7, 56)
                    .map(x -> 2 * x * x - 5 * x + 6)
                    .mapToInt(Integer::intValue)
                    .sum()
            );
        };

        lambda2.sum();
    }
}
