package com.block.java.base;

/**
 * 题目：Object有哪些方法？
 * 1.equals()
 * 2.hashCode()
 * 3.wait()
 * 4.notify()
 * 5.toString()
 * 6.getClass()
 * 7.notifyAll();
 *
 * 意图：
 * 考察基础，进一步的深入探讨
 * 1.equals() 和 hashCode()
 * 2.wait() 和 notify()
 *
 * 遇到的次数：
 * 百度1，小红书1
 */
class ObjectMethod {

    Object mObject = new Object();

    void objectMethod(){
        mObject.equals(new Object());
        mObject.hashCode();
        mObject.getClass();
        mObject.toString();
        try {
            mObject.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mObject.notify();
        mObject.notifyAll();
    }
}
