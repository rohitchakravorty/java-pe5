package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class WordCountTest
{

    WordCount ob;
    @Before
    public void setUp(){
        ob=new WordCount();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenStringShouldReturnResult()
    {
        HashMap<String,Integer> result=ob.wordCounter("one one -one___two,,three,one @three*one?two”");
        assertEquals("",result);
    }
}
