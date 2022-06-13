package com.project;

import java.util.stream.Stream;

public class Main {

    public static void main( String[] args ) {

        Stream.iterate(1, x->x+1).map(x->x*x*x).limit(100).forEach(System.out::println);

    }

}
