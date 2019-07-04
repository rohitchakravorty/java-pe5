package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
/*to find the number of counts in the following String.*/
public class WordCount {
    public HashMap<String, Integer> wordCounter(String inputString) {
        inputString = inputString.replaceAll("[-+.^:_,@*?;<>___”]", " "); //Replacing the special characters with space.
        HashMap<String, Integer> result=new HashMap<>();
        String[] arr=inputString.split(" ");   //Splitting the input string
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(result.get(arr[i])==null)
            {
                result.put(arr[i],1);
            }
            else
            {
                result.put(arr[i],result.get(arr[i])+1);
            }
        }
        result.remove("");
        return result;

    }
}
