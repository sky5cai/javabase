package com.base.javabase.reflection.oracle;

/**
 * Simulating the instanceof Operator-判断是不是当前实例
 */
class A {}

public class instance1 {
    public static void main(String args[])
    {
        try {
            Class cls = Class.forName("com.base.javabase.reflection.oracle.A");
            boolean b1
                    = cls.isInstance(new Integer(37));
            System.out.println(b1);
            boolean b2 = cls.isInstance(new A());
            System.out.println(b2);
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}
