package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int index = left;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= Math.abs(left - right); i++) {
            integers.add(index);
            if (left > right) index--;
            else index++;
        }
        return integers;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return getListByInterval(left, right).stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).boxed().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
