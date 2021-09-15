package com.company.Netology;

import java.util.*;

public class Main {

    private static List<Integer> positiveEvenNumber (List<Integer> list){
        List<Integer> list2 = new ArrayList<>();
        for(Integer integer : list){
            if(integer > 0 && integer % 2 == 0){
                list2.add(integer);
                bubbleSort(list2);
            }
        }
        return list2;
    }

    private static List<Integer> bubbleSort(List<Integer> list) {
        int number = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) > list.get(i)) {
                    number = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, number);
                    sorted = false;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbersList = positiveEvenNumber(intList);
        System.out.println("Сортировка без Stream API: \n" + bubbleSort(positiveNumbersList));

        System.out.println("------------- \nStream API \n-------------");
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }


}
