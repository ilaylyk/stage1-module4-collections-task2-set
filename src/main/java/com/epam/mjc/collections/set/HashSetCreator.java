package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public static HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> states = new HashSet<>();
        for (Integer integer : sourceList) {
            states.add(integer);
            if (integer % 2 == 0) {
                states.add(integer / 2);
            } else {
                states.add(integer);
                states.add(integer * 2);
            }
        }
        return states;
    }
}
