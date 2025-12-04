package main.java.basics;

import java.util.*;

public class JavaCollectionsAdvanced {
    public static void main(String[] args) {

        // Map básico
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Dante", 90);
        scoreMap.put("Coco", 95);
        scoreMap.put("Chancla", 88);

        // Iterar
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Contar frecuencias de palabras
        String text = "java java spring boot java spring";
        String[] words = text.split(" ");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        System.out.println("Frequencies: " + freq);

        // Ordenar por clave
        Map<String, Integer> treeMap = new TreeMap<>(freq);
        System.out.println("Sorted by key: " + treeMap);

        // Ordenar por valor
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by value: " + list);
    }
}
