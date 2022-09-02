package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> states = new HashSet<>(thirdSet);

        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        intersection.removeAll(states);

        states.removeAll(firstSet);
        states.removeAll(secondSet);

        states.addAll(intersection);

        return states;
    }
}
