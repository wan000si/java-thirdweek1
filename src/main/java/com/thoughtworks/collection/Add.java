package com.thoughtworks.collection;

import com.thoughtworks.Helper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int evens = 1;
        //System.out.println(Helper.getSumOfInt(leftBorder,rightBorder,evens));
        return Helper.getSumOfInt(leftBorder,rightBorder,evens);
       // throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int  odds= 0;
        System.out.println(Helper.getSumOfInt(leftBorder,rightBorder,odds));
        return Helper.getSumOfInt(leftBorder, rightBorder, odds);
        //throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return Helper.getSumOfArrayAdd3(arrayList);
       // throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return Helper.getTripleOfOddAndAddTwo(arrayList);
        //throw new NotImplementedException();

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //throw new NotImplementedException();
        return Helper.getSumOfProcessedOdds(arrayList);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        int even = 1;
        list=Helper.getArrayOfIndex(arrayList,even);
        int length=list.size();
       // double median;
        Collections.sort(list);
        if (length % 2 == 0) {
            return (list.get(length / 2) + list.get(length / 2 - 1)) / 2;
        } else {
            return list.get(length/2);
        }
        //throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        int even = 1;
        list=Helper.getArrayOfIndex(arrayList,even);
        return Helper.getSumOfArray(list)/list.size();
        //throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> list = new ArrayList<Integer>();
        int even=1;
        list=Helper.getArrayOfIndex(arrayList,even);
        return list.contains(specialElment);
        //throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        int even=1;
        list=Helper.getArrayOfIndex(arrayList,even);
        return
                list.stream().distinct().collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        int even =1,odd=0;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> listOfEven = Helper.getArrayOfIndex(arrayList,even);
        List<Integer> listOfOdd = Helper.getArrayOfIndex(arrayList,odd);
        Collections.sort(listOfEven);
        Collections.sort(listOfOdd);
        Collections.reverse(listOfOdd);
        list.addAll(listOfEven);
        list.addAll(listOfOdd);
        return list;
        //throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        return Helper.getProcessedList(arrayList);
        // /throw new NotImplementedException();
    }
}
