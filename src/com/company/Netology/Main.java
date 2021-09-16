package com.company.Netology;

import java.util.*;

public class Main {

    private static int[] positiveEvenNumber (int[] arr){
        int countPositiveEven = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                countPositiveEven++;
            }
        }
        int[] arr2 = new int[countPositiveEven];
        int positiveEvenNum = 0;
        for(int j = 0; j < arr.length; j++) {
            if (arr[j] > 0 && arr[j] % 2 == 0) {
                arr2[positiveEvenNum++] = arr[j];
            }
        }

        return arr2;
    }

    private static int[] bubbleSort(int[] arr) {
         for(int i = arr.length - 1; i >= 1; i--){
             for(int j = 0; j < i; j++){
                 int a = arr[i];
                 if (a < arr[j]) {
                    int x = arr[j];
                    arr[i] = x;
                    arr[j] = a;

                }
            }
         }
     return arr;
       }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int[] intArr = new int[intList.size()];
        for(int i = 0; i < intList.size(); i++) {
            intArr[i] = intList.get(i);
        }

        int[] positiveEvenArr = positiveEvenNumber(intArr);
        int[] sortedArr = bubbleSort(positiveEvenArr);
        System.out.println("Сортировка без Stream API: \n" + Arrays.toString(sortedArr));

        System.out.println("------------- \nStream API \n-------------");
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }


}
