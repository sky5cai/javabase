package com.base.javabase.reflection.oracle;

import java.lang.reflect.Array;

/**
 * Using Arrays-使用数组
 */
public class array1 {
    public static void main(String args[]) {
        try {
            Class cls = Class.forName("java.lang.String");
            Object arr = Array.newInstance(cls, 10);
            Array.set(arr, 5, "this is a test");
            String s = (String) Array.get(arr, 5);
            System.out.println(s);
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}