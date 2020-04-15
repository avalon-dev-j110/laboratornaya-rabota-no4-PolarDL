/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        return s1.compareTo(s2)*(-1);
    }
    
}
