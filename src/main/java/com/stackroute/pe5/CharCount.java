package com.stackroute.pe5;

import java.util.HashMap;
/*an array of strings is input and output is a Map<String,boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array*/
public class CharCount {
    public HashMap<String, Boolean> charCounter(String[] inputArr)
    {
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        HashMap<String, Boolean> noOfOccur=new HashMap<>();
        for(String str:inputArr)
        {
            Integer loop=map.get(str);
            map.put(str,(loop == null)?1:loop+1);  //Checking whether the character is present once or more than that
            int count=map.get(str);
            noOfOccur.put(str,(count>1)? true : false);

        }
        return noOfOccur;
    }


}
