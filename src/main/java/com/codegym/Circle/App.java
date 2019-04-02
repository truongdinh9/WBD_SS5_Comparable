package com.codegym.Circle;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(1,"red");
        circles[1]=new ComparableCircle(2,"blue");
        circles[2]=new ComparableCircle();
        Arrays.sort(circles,ComparableCircle::compareTo);
        for (ComparableCircle circle:circles
             ) {
            System.out.println(circle);

        }
    }
}
