package com.stackroute.pe5;

import java.util.Map;
/*that accepts a Map object having two key-value pairs with the keys val1 and val2.*/
public class ValuesUpdater {
    public Map<String,String> updateValues(Map<String,String> map)
    {
        map.put("val2",map.get("val1"));   //Copying the value of val1 to val2
        map.put("val1","");                //Setting the value of val1 to empty.
        return map;
    }
}
