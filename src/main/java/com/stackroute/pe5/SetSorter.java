package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.TreeSet;
/*to implement set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list*/
public class SetSorter {
    public ArrayList<String> setSort(String str)
    {
        String[] arr=str.split(" ");
        TreeSet<String> sorted=new TreeSet<>();   //Created treeset so that the elements gets sorted
        for(String s:arr)
        {
            sorted.add(s);
        }
        return new ArrayList<>(sorted);

    }

}
