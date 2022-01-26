package com.block.java.base;

import androidx.annotation.Nullable;

import java.util.HashSet;

/**
 * 为什么要重写 equals() 和 hashCode()
 * 1.equals 效率低
 * 2.hashCode 不可靠
 * <p>
 * hashCode 相等 equals 不一定相等
 * equals 相等 hashCode 一定相等
 * <p>
 * 一个类如果没有重写 equals() 方法，相等于通过 == 比较，比较的是对象在内存中的地址
 * <p>
 * 次数：1
 */
public class EqualsAndHashCode {

    public void equals() {
        HashSet set = new HashSet();
        set.add(new A());
        set.add(new A());
        set.add(new B());
        set.add(new B());
        set.add(new C());
        set.add(new C());
        System.out.println(set);
        // [com.block.java.base.EqualsAndHashCode$B@1,
        // com.block.java.base.EqualsAndHashCode$B@1,
        // com.block.java.base.EqualsAndHashCode$A@5465b54,
        // com.block.java.base.EqualsAndHashCode$C@2,
        // com.block.java.base.EqualsAndHashCode$A@ec3caa7]
        //1.A 只重写了 equals() ，存了2个对象，B 只重写了 hashCode(),存了2对象。
        //2.即也就是，当把一个对象放入HashSet 中时，如果需要重写该对象对应类的 equals() 方法，则也应该重写其hashCode() 方法。规则是：如果两个对象通过equals() 方法比较返回true,这两个对象的 hashCode 值也应该相同。
        //3.如果两个对象通过euqals() 方法比较返回true,但这两个对象的 hashCode() 方法返回不同的hashCode 值
        //
        //时，这将导致HashSet 会把这两个对象保存在 Hash 表的不同位置，从而使两个对象都可以添加成功，这就与Set 集合的规则冲突了。
        //4.如果两个对象的 hashCode() 方法返回的 hasCode 值相同，但他们通过 equals() 方法比较返回false 时将更麻烦：因为两个对象的hashCode   值相同，HashSet 将试图 把它们保存在同一个位置，但又不行(否则将只剩下一个对象)，所以实际上会在这个位置用链式结构来保存多个对象；而HashSet 访问集合元素时也是根据元素的 hashCode 值来快速定位的，如果 hashSet 中两个以上的元素具有相同的 HashCode 值时，将会导致性能下降。
    }

    class A {

        @Override
        public boolean equals(@Nullable Object obj) {
            return true;
        }
    }

    class B {
        @Override
        public int hashCode() {
            return 1;
        }
    }

    class C {
        @Override
        public int hashCode() {
            return 2;
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            return true;
        }
    }
}
