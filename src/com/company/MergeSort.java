package com.company;

public class MergeSort extends Sorter {

    public MergeSort () {
        super.type = SortType.MERGESORT;
    }

    @Override
    protected void sort() {
        System.out.println("Sorting with merge sort....");
    }
}
