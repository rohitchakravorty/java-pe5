package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ValuesUpdaterTest {

    ValuesUpdater ob;
    @Before
    public void setUp(){
        ob=new ValuesUpdater();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenTwoStringShouldReturnVal1Null() {
        HashMap<String,String> map= new HashMap<String,String>();
        map.put("val1","java");
        map.put("val2","c++");
        String result =ob.updateValues(map).toString();
        assertEquals("{val2=java, val1=}",result);
    }

    @Test
    public void givenBlankStringShouldReturnBothBlank() {
        HashMap<String,String> map= new HashMap<String,String>();
        map.put("val1"," ");
        map.put("val2"," ");
        String result =ob.updateValues(map).toString();
        assertEquals("{val2= , val1= }",result);
    }

}