package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "src/main/resources/Products.csv";
    public static void main(String[] args){

        List<Product> products1 = Service.readData(FILE_PATH);
        List<Product> products2 = Service.readData(FILE_PATH);
        List<Product> products3 = Service.readData(FILE_PATH);
        List<Product> products4 = Service.readData(FILE_PATH);

        long before1 = System.currentTimeMillis();
        Counter counter1 = Algorithms.bubbleSort(products1);
        long after1 = System.currentTimeMillis();

        long before2 = System.currentTimeMillis();
        Counter counter2 = Algorithms.insertionSort(products2);
        long after2 = System.currentTimeMillis();

        long before3 = System.currentTimeMillis();
        Counter counter3 = Algorithms.selectionSort(products3);
        long after3 = System.currentTimeMillis();

        long before4 = System.currentTimeMillis();
        Counter counter4 = Algorithms.shellSort(products4);
        long after4 = System.currentTimeMillis();

        products1.forEach(System.out::println);
        System.out.println("Number of compares: " + counter1.compares +". Number of swaps: " + counter1.swaps
                + ". Time: " + (before1 - after1));
        System.out.println();

        products2.forEach(System.out::println);
        System.out.println("Number of swaps: " + counter2.swaps
                + ". Time: " + (before2 - after2));
        System.out.println();

        products3.forEach(System.out::println);
        System.out.println("Number of compares: " + counter3.compares +". Number of swaps: " + counter3.swaps
                + ". Time: " + (before3 - after3));
        System.out.println();

        products4.forEach(System.out::println);
        System.out.println("Number of compares: " + counter4.compares +". Number of swaps: " + counter4.swaps
                + ". Time: " + (before4 - after4));
        System.out.println();




    }

}