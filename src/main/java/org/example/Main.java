package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>colorList = List.of("black","gray","green","blue","white","yellow","pink");
        colorList.forEach(System.out::println);
    }
}