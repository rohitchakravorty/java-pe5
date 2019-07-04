package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetSorterTest {

    SetSorter ob;
    @Before
    public void setUp(){
        ob=new SetSorter();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenStringShouldReturnSortedArrayList()
    {

        String result=ob.setSort("Eugene Harry Alice Olive Bluto").toString();
        assertEquals("[Alice, Bluto, Eugene, Harry, Olive]",result);
    }


}