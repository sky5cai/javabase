package com.base.javabase.reflection.oracle;

import java.lang.reflect.Constructor;

/**
 * 获取有关构造函数的信息
 */
public class constructor1 {
    public constructor1() {
    }

    protected constructor1(int i, double d) {
    }

    public static void main(String args[]) {
        try {
            Class cls = Class.forName("com.base.javabase.reflection.oracle.constructor1");
            Constructor ctorlist[] = cls.getDeclaredConstructors();
            for (int i = 0; i < ctorlist.length; i++) {
                Constructor ct = ctorlist[i];
                System.out.println("name = " + ct.getName());
                System.out.println("decl class = " + ct.getDeclaringClass());
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}