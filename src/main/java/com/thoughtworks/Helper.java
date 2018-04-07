package com.thoughtworks;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static int getSumOfInt(int leftBorder, int rightBorder, int theTpye) {
        int sum=0;
        for (int i = leftBorder; i <= rightBorder ; i++) {
            if (theTpye == 1) {
                if (i % 2 == 0) {
                    sum += i;
                }
            } else {
                if (i % 2 != 0) {
                    sum+=i;
                }
            }
            }
            return sum;
    }
    public static int getSumOfArrayAdd3(List<Integer> arrayList) {
        int sumOfArray = 0;
        for (int i:arrayList) {
            sumOfArray+=i*3+2;
        }
        return sumOfArray;
    }
    public static List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i : arrayList) {
            if (i % 2 != 0) {
                list.add(i * 3 + 2);
            } else {
                list.add(i);
            }
        }
        return list;
    }
    public static int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sumOfOdds = 0;
        for (int i : arrayList) {
            if (i % 2 != 0) {
                sumOfOdds+=i*3+5;
            }
        }
        return sumOfOdds;
    }
    public static List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            list.add(arrayList.get(i)+arrayList.get(i+1));
        }
        return list;
    }
    public static List<Integer> getArrayOfIndex(List<Integer> arrayList,int theType) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arrayList) {
            if (theType == 1) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            } else {
                if (i % 2 != 0) {
                    list.add(i);
                }
            }

        }
        return list;
    }

    public static double getSumOfArray(List<Integer> arrayList) {
        int sumOfArray = 0;
        for (int i:arrayList) {
            sumOfArray+=i;
        }
        return sumOfArray;
    }
}
