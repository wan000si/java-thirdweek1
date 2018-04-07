package com.thoughtworks.collection;

import com.sun.deploy.util.ArrayUtil;
import com.thoughtworks.Helper;
import org.mockito.internal.util.collections.ArrayUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> listLR = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        listLR=Helper.getList(left,right);
        Collections.reverse(list);
        return list;
        //throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        int even =1;
        list = Helper.getArrayOfIndex(Helper.getList(left,right),even);
        //Collections.reverse(list);
        //System.out.println(list);

        return list;
        //throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int even =1;
        return Helper.getArrayOfIndex(list,even);
        //throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        List list = Arrays.asList(array);
        return (int) list.get((list.size()-1));
        //throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List listOfFirstArray = Arrays.asList(firstArray);
        List listOfSecondArray = Arrays.asList(secondArray);
        return Helper.popCommonElement(listOfFirstArray,listOfSecondArray);
        //throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> listFS = Helper.popCommonElement( Arrays.asList(firstArray), Arrays.asList(secondArray));
        for (Integer i : Arrays.asList(secondArray)) {
            if (!listFS.contains(i)) {
                Arrays.asList(firstArray).add(i);
            }
        }
//        Arrays.asList(secondArray).removeAll(listFS);
//        Arrays.asList(firstArray).addAll(Arrays.asList(secondArray));
       // System.out.println(Arrays.asList(firstArray).size());
        return Arrays.asList(firstArray);
        //throw new NotImplementedException();
    }
}
