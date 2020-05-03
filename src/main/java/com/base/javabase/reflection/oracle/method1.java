package com.base.javabase.reflection.oracle;

import java.lang.reflect.Method;

/**
 * 找出有关类的方法
 */
public class method1 {
    private int f1(Object p, int x) throws NullPointerException {
        if (p == null) throw new NullPointerException();
        return x;
    }

    public static void main(String args[]) {
        try {
            Class cls = Class.forName("com.base.javabase.reflection.oracle.method1");
            Method methlist[] = cls.getDeclaredMethods();
            for (int i = 0; i < methlist.length; i++) {
                Method m = methlist[i];
                System.out.println("name = " + m.getName());
                System.out.println("decl class = " + m.getDeclaringClass());
                //方法的参数有类型
                Class pvec[] = m.getParameterTypes();
                for (int j = 0; j < pvec.length; j++) System.out.println(" param #" + j + "" + pvec[j]);
                //判处异常类型
                Class evec[] = m.getExceptionTypes();
                for (int j = 0; j < evec.length; j++) System.out.println("exc #" + j + " " + evec[j]);
                //方法返回的类型
                System.out.println("return type = " + m.getReturnType());
                System.out.println("-----");
            }
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
