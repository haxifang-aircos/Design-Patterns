package com.aircos.ConcreteProduct;

import com.aircos.IProduct.ICourse;

/**
 * Java 课程
 *
 * note: 具体产品, 是简单工厂模式的创建目标
 */
public class JavaCourse implements ICourse {
    public void record() {
        System.out.println("录制 Java 课程中");
    }
}
