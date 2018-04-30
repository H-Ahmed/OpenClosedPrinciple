package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new MergeSort());
        sorterManager.sort(new InsertionSort());
    }
}
