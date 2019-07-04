package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainTest
{
    public String checker(ArrayList<Student> students)
    {
        Comparator<Student> studentComparator=new StudentSorter();
        Collections.sort(students,studentComparator);
        return students.toString();
    }
}
