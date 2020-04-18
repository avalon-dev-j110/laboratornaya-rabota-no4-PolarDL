package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class SortImpl implements Sort{

    @Override
    public void sort(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++){
                boolean hasSwapped = false;
                for (int k = 0; k < array[j].toString().length(); k++){
                    if (array[j].toString().charAt(k) > array[j + 1].toString().charAt(k)) {
                    Object buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                    hasSwapped = true;
                    }
                }
                if (hasSwapped) break;
            }
        }
    }

    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }
}
