package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list=new ArrayList<Integer>();
        for (;number-2>0;) {
            list.add(number-2);
            number-=2;
        }
        return list;
        //throw new NotImplementedException();
    }
}
