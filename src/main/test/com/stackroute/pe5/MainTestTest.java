package com.stackroute.pe5;

import com.sun.tools.javac.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest ob;
    @Before
    public void setUp()
    {
        ob=new MainTest();
    }

    @After
    public void tearDown() {
        ob=null;
    }
    @Test
    public void implementer() {
        ArrayList<Student> students=new ArrayList<Student>();
        Student student1=new Student("Rohit","FHG",22);
        Student student2=new Student("Sabya","IAD",21);
        Student student3=new Student("Utkarsh","JHI",22);
        Student student4=new Student("Abinash","CKA",20);
        Student student5=new Student("Clinton","SWA",32);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        String result=ob.checker(students);
        assertEquals("[Student{id=Clinton, age=32, name='SWA'}, Student{id=Rohit, age=22, name='FHG'}, Student{id=Utkarsh, age=22, name='JHI'}, Student{id=Sabya, age=21, name='IAD'}, Student{id=Abinash, age=20, name='CKA'}]",result);
    }

}