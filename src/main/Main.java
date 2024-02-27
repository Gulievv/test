package main;

import patterns.P;
import patterns.T;

public class Main {
    public static void main(String[] args) {
        T.TBuilder builder = T.builder();
       builder.setName("test2");
       builder.setP(new P());

        T t = builder.build();
        System.out.println(t.getName());

    }
}
