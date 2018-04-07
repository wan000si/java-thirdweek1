package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        //List<Integer> list=new ArrayList<>();

        return array.stream().map(var->{var++;var*=3;return var;}).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        List<String > list=new ArrayList<>();
        array.stream().map(var->{var++;var+='a'-1;return var;}).forEach(i->list.add(String.valueOf(i)));
        return list;
        //throw new NotImplementedException();
    }

    public List<String> mapLetters() {
        List<String > list=new ArrayList<>();
        array.stream().map(var->
            {var++;return String.valueOf(var/26+'a'-1)+String.valueOf(var%26+'a'-1);})
                .forEach(i->list.add(String.valueOf(i)));
        return list;
        //throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
        //throw new NotImplementedException();
    }
}
