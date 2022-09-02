package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> states = new HashSet<>();
        int temp;
        for (Integer integer : sourceList) {
            temp = (int) Math.pow(integer, 2);
            if (temp >= lowerBound && temp <= upperBound) {
                states.add(temp);
            }
        }
        return states;
    }
}
