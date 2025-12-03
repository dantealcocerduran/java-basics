package main.java.basics;

import java.util.*;
import java.util.stream.Collectors;

    public class JavaStreamsIntro {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Dante", "Coco", "Chancla", "Kiara", "Tetito");

            // Filtrar
            List<String> namesStartingWithA = names.stream()
                    .filter(n -> n.startsWith("A"))
                    .collect(Collectors.toList());
            System.out.println("Nombres que empiezan con A: " + namesStartingWithA);

            // Mapear
            List<Integer> lengths = names.stream()
                    .map(String::length)
                    .collect(Collectors.toList());
            System.out.println("Longitudes: " + lengths);

            // Eliminar repetidos
            List<String> uniqueNames = names.stream()
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Únicos: " + uniqueNames);

            // Ordenar
            List<String> sortedNames = names.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Ordenados: " + sortedNames);
        }
    }
