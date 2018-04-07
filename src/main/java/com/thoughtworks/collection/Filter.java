package com.thoughtworks.collection;

import com.thoughtworks.Helper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(i->i%2==0).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(i ->i%3==0).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return Helper.popCommonElement(firstList,secondList);
        //throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());
        //throw new NotImplementedException();
    }
}