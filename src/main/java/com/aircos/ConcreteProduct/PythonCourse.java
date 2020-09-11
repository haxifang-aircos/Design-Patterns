package com.aircos.ConcreteProduct;

import com.aircos.IProduct.ICourse;

/**
 * Python 课程
 *
 * note: 具体产品, 是简单工厂模式的创建目标
 */
public class PythonCourse implements ICourse {
    public void record() {
        System.out.println("录制 Python 课程中");
    }
}
