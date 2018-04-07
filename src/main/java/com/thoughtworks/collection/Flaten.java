package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(array).forEach(i->list.addAll(Arrays.asList(i)));
       //System.out.println(list);
        return list;
        //throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(array).distinct().forEach(i->list.addAll(Arrays.asList(i)));
        //System.out.println(list.stream().distinct().collect(Collectors.toList()));
        return list.stream().distinct().collect(Collectors.toList());
        //throw new NotImplementedException();
    }
}
