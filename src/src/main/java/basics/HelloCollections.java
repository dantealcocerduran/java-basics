package main.java.basics;

import java.util.*;

public class HelloCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dante");
        names.add("Coco");
        names.add("Chancla");

        Set<String> unique = new HashSet<>(names);

        System.out.println("List: " + names);
        System.out.println("Set: " + unique);
    }
}

