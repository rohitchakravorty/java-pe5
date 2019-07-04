package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CharCountTest
{


        CharCount ob;
        @Before
        public void setUp()
    {
        ob=new CharCount();
    }

        @After
        public void tearDown() {
        ob=null;
    }
        @Test
        public void givenStringShouldReturnResult()
        {

            String[] inputString={"a","b","c","d","a","c","c"};
            Map result=ob.charCounter(inputString);
            assertEquals("{a=true, b=false, c=true, d=false}",result.toString());
        }
    }

