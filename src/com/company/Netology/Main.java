package com.company.Netology;

import java.util.*;

public class Main {

    private static List<Integer> SortedPositiveEvenNumber (List<Integer> list){
        List<Integer> list2 = new ArrayList<>();
        for(Integer integer : list){
            if(integer > 0 && integer % 2 == 0){
                list2.add(integer);
                Collections.sort(list2);
            }
        }
        return list2;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Сортировка без Stream API: \n" + SortedPositiveEvenNumber(intList));

        System.out.println("------------- \nStream API \n-------------");
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }


}
