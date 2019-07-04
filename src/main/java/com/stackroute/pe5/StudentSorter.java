package com.stackroute.pe5;

import java.util.Comparator;
//The comparator class
public class StudentSorter implements Comparator<Student>
{


    @Override
    public int compare(Student o1, Student o2)
    {
        if(o2.getAge()>o1.getAge())
        {
            return 1;
        }
        else if (o2.getAge()<o1.getAge())
        {
            return -1;
        }
        else if(o2.getAge()==o1.getAge())
        {
            if (o2.getName().compareTo(o1.getName())==0)
            {
                return o2.getId().compareTo(o1.getId());
            }
            return o1.getName().compareTo(o2.getName());
        }
        return 0;
    }
}
