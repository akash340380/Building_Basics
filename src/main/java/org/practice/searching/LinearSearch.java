package org.practice.searching;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LinearSearch {
    public static void main(String[] args) {
        BiFunction<List<Integer>, Integer, Integer> ls = (x, y) -> {
            for (int i = 0; i < x.size(); i++) {
                int finalI = i;
                Predicate<Integer> pd = z -> y == x.get(finalI);
                if (pd.test(i)) {
                    return finalI;
                }
            }
            return -1;
        };
        System.out.println(ls.apply(Arrays.asList(1, 2, 3, 98, 99, 100), 99));
    }
}
