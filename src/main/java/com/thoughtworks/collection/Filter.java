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
        int even=1;
        this.array=Helper.getArrayOfIndex(array,even);
        //this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list =new ArrayList<Integer>();
        return list.stream().filter(i ->i%3==0).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list =new ArrayList<Integer>();
        return list.stream().distinct().collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return Helper.popCommonElement(firstList,secondList);
        //throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> firstList =new ArrayList<Integer>();
        List<Integer> secondList =new ArrayList<Integer>();
        firstList.removeAll(secondList);
        return firstList;
        //throw new NotImplementedException();
    }
}