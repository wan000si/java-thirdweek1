package com.thoughtworks.collection;

import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.thoughtworks.Helper;
//import org.mockito.internal.util.collections.ArrayUtils;
///import org.mockito.internal.util.collections.ArrayUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
//        List<Integer> listLR = new ArrayList<Integer>();
//        List<Integer> list = new ArrayList<Integer>();
//        listLR=Helper.getList(left,right);
        //Collections.reverse(list);
        return Helper.getList(left,right);
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
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        return list.get((list.size() - 1));
        //throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> listOfFirstArray = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> listOfSecondArray = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
       return Helper.popCommonElement(listOfFirstArray,listOfSecondArray);
        //throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
//        List<Integer> listFS = Helper.popCommonElement( Arrays.asList(firstArray), Arrays.asList(secondArray));
//        System.out.println(listFS);
        System.out.println(Arrays.asList(secondArray));
        List<Integer> list=Arrays.stream(secondArray).filter(i->!Arrays.asList(firstArray)
                .contains(i)).collect(Collectors.toList());
        System.out.println(list);
//        List<Integer> result = Arrays.asList(firstArray);
        List<Integer> result =new ArrayList<>();
        result.addAll(Arrays.asList(firstArray));
        result.addAll(list);
        System.out.println(result);
//        result.addAll(list);
        System.out.println(result);
        return result;
//        List<Integer> first = Arrays.asList(firstArray);
//        List<Integer> second = Arrays.asList(secondArray);
//        List<Integer> list=Arrays.stream(secondArray).filter(i->!Arrays.asList(firstArray)
//               .contains(i)).collect(Collectors.toList());
//        List<Integer> result = new ArrayList<>();
//        result.addAll(first);
//        result.addAll(list);
//        return result;
        //throw new NotImplementedException();
    }
}
