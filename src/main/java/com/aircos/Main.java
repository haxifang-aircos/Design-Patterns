package com.aircos;

import com.aircos.ConcreteProduct.JavaCourse;
import com.aircos.IProduct.ICourse;
import com.aircos.SimpleFactory.CourseFactory;

public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
