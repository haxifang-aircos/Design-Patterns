package com.aircos.SimpleFactory;

import com.aircos.IProduct.ICourse;

/**
 * 课程简单工厂
 *
 * note: 简单工厂, 简单工厂模式的核心, 负责实现创建所有实例的内部逻辑
 */
public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
