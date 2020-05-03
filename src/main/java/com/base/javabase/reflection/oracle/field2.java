package com.base.javabase.reflection.oracle;

import java.lang.reflect.Field;

/**
 * Changing Values of Fields-更改字段的值
 */
public class field2 {
    public double d;

    public static void main(String args[]) {
        try {
            Class cls = Class.forName("com.base.javabase.reflection.oracle.field2");
            Field fld = cls.getField("d");
            field2 f2obj = new field2();
            System.out.println("d = " + f2obj.d);
            fld.setDouble(f2obj, 12.34);
            System.out.println("d = " + f2obj.d);
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}