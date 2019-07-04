package com.stackroute.pe5;
//This class contains the members and getters setters
public class Student {
    private String id;
    private int age;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public Student(String id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
