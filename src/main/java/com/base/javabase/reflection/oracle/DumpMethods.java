package com.base.javabase.reflection.oracle;

import java.lang.reflect.Method;
import java.util.Stack;

/**
 * A Simple Example-一个简单的例子
 */
public class DumpMethods {

    public static void main(String args[])
    {
        try {
            Class c = Stack.class;
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}
