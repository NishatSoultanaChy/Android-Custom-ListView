package com.mua.mua.customlistview;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public class Course {

    String name="";
    List<Content> contents=new ArrayList<>();


    Course(String name)
    {
        this.name=name;
    }

    public void addContent(Content x)
    {
        contents.add(x);
    }



}
