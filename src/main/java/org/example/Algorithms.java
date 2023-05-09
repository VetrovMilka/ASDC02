package org.example;

import java.util.List;

public class Algorithms {

    public static Counter bubbleSort(List<Product> products) {
        int n = products.size();
        Counter counter = new Counter();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                counter.compares++;
                if (products.get(j).getId() > products.get(j + 1).getId()) {
                    counter.swaps++;
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
        return counter;
    }



    public static Counter insertionSort(List<Product> products) {
        int n = products.size();
        Counter counter = new Counter();

        for (int i = 1; i < n; ++i) {
            Product key = products.get(i);
            int j = i - 1;

            while (j >= 0 && products.get(j).getId() > key.getId()) {
                products.set(j + 1, products.get(j));
                j = j - 1;
                counter.swaps++;
            }
            products.set(j + 1, key);
        }
        return counter;

    }


    public static Counter selectionSort(List<Product> products) {
        int n = products.size();
        Counter counter = new Counter();

        for (int i = 0; i < n-1; i++) {

            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                counter.compares++;
                if (products.get(j).getId() < products.get(min_idx).getId()) {
                    min_idx = j;
                }
            }

            counter.swaps++;
            Product temp = products.get(min_idx);
            products.set(min_idx, products.get(i));
            products.set(i, temp);
        }
        return counter;
    }

    public static Counter shellSort(List<Product> products) {
        int n = products.size();
        Counter counter = new Counter();

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                counter.compares++;

                Product temp = products.get(i);
                int j;
                for (j = i; j >= gap && products.get(j - gap).getId() > temp.getId(); j -= gap) {
                    products.set(j, products.get(j - gap));
                    counter.swaps++;
                }
                products.set(j, temp);
            }
        }
        return counter;
    }

}
