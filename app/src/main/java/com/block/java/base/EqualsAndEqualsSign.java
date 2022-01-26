package com.block.java.base;

import android.util.Log;

/**
 * 题目：equals() 和 == 的区别？
 */
public class EqualsAndEqualsSign {

    /**
     * 比较基础数据类型
     */
    void equalsBaseData() {
        int a = 10;
        int b = 10;
        Log.i("yhblock", "equalsBaseData: " + (a == b));
    }

    /**
     * 比较引用类型
     * 1.== 比较地址
     * 2.equals 比较值
     */
    public void equalsReferenceData() {
        String a = "Android";
        String b = "Android";
        Student c = new Student("block", 99);
        Student d = new Student("block", 99);
        Log.i("yhblock", "equalsReferenceData(==): " + (a == b));
        Log.i("yhblock", "equalsReferenceData(equals): " + (a.equals(b)));
        Log.i("yhblock", "equalsReferenceData(==): " + (c == d));
        Log.i("yhblock", "equalsReferenceData(equals): " + (c.equals(d)));
    }

    class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
