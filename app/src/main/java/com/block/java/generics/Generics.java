package com.block.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * Java 的泛型是基于编译器的，生成的字节码是不包含泛型中的类型信息
 * 泛型擦除：泛型的类型在编译器编译的时候会被擦除
 * <p>
 * 类型擦除也是Java的泛型实现方法与C++模版机制实现方式之间的重要区别。
 * <p>
 * 问题：1.super 和 extends 的区别？
 * 问题：2.为什么会有泛型擦除
 * Java 中的泛型是一种伪泛型，会在编译时擦除。
 * https://blog.csdn.net/u014674862/article/details/105676880
 *
 *
 */
class Generics {

    void main() {
        People people = new People();
    }

    /**
     * 有什么问题？
     * int 加不了
     * 为何会有这个问题？
     */
    void question() {
        List<? extends Object> list = new ArrayList<>();
        //list.add(123);
        Object object = list.get(0);
    }
}


class People {

}

class Man extends People {

}

class Woman extends People {

}

class SuperMan extends Man {

}
