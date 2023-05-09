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

        Counter counter1 = Algorithms.bubbleSort(products1);
        Counter counter2 = Algorithms.insertionSort(products2);
        Counter counter3 = Algorithms.selectionSort(products3);
        Counter counter4 = Algorithms.shellSort(products4);

        products1.forEach(System.out::println);
        System.out.println("Number of compares: " + counter1.compares +". Number of swaps: " + counter1.swaps);
        System.out.println();

        products2.forEach(System.out::println);
        System.out.println("Number of swaps: " + counter2.swaps);
        System.out.println();

        products3.forEach(System.out::println);
        System.out.println("Number of compares: " + counter3.compares +". Number of swaps: " + counter3.swaps);
        System.out.println();

        products4.forEach(System.out::println);
        System.out.println("Number of compares: " + counter4.compares +". Number of swaps: " + counter4.swaps);
        System.out.println();




    }

}