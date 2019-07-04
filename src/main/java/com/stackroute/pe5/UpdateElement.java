package com.stackroute.pe5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/*to update specific array element by given element*/
public class UpdateElement
{
    public ArrayList<String> replaceElement(ArrayList<String> input,String toReplace,String replaceWith)
    {
        int index=input.indexOf(toReplace);   //Getting the index of the string to be replaced.
        input.set(index,replaceWith);

        return input;
    }
}
