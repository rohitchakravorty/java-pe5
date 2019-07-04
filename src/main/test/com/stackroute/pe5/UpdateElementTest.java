package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateElementTest
{
    UpdateElement ob;
    @Before
    public void setUp(){
        ob=new UpdateElement();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void givenInputStringShouldReplace()
    {
        ArrayList<String> elements =new ArrayList<>();
        elements.add("Apple");
        elements.add("Grape");
        elements.add("Melon");
        elements.add("Berry");
        ArrayList<String> result = ob.replaceElement(elements,"Apple","Kiwi");

    }


}