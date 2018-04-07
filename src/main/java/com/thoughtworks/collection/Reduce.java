package com.thoughtworks.collection;

import com.thoughtworks.Helper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        //throw new NotImplementedException();
    }

    public double getMinimum() {
        return arrayList.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        //throw new NotImplementedException();
    }

    public double getAverage() {
        int sumAll =arrayList.stream().reduce(0,(sum, item) -> sum + item);
        long countAll=arrayList.stream().count();

        return (double) sumAll/countAll;
        //throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        List<Integer> list = arrayList.stream().sorted().collect(Collectors.toList());
        double median;
        Collections.reverse(list);
        if (list.size() % 2 == 0) {
            median = (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        } else {
            median = (double)(list.get(list.size() / 2));
        }
        return median;
        //throw new NotImplementedException();
    }

    public int getFirstEven() {
//        int even =1;
//        return Helper.getArrayOfIndex(arrayList,even).get(0);
        return arrayList.stream().filter(var->var%2==0).findFirst().get();
        //throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
//        int even =1;
//        return Helper.getArrayOfIndex(arrayList,even).get(0);
        return arrayList.indexOf(getFirstEven());
        //throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.stream().allMatch(var->arrayList.contains(var) );
        //throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink<Integer> singleLink) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <singleLink.size() ; i++) {
            singleLink.addHeadPointer(i);
            list.add(singleLink.getHeaderData());
        }
        this.arrayList=list;
        return getOrderedMedian();
        //throw new NotImplementedException();
    }

    public int getLastOdd() {
        List<Integer> list = arrayList.stream().filter(var-> var%2!=0).collect(Collectors.toList());
        return list.get(list.size()-1);
        //throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        return arrayList.indexOf(getLastOdd());
        //throw new NotImplementedException();
    }
}
