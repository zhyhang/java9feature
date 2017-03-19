package com.zyh.java9.feature.unsafe;


import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * How to using unsafe in jdk9.<br>
 *
 * @see https://www.javacodegeeks.com/2017/03/using-sun-misc-unsafe-java-9.html
 * Created by zhyhang on 2017/3/18.
 */
public class HowToUseUnsafe {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("The address(in sun.unsafe) size is: " + getUnsafe().addressSize());
        // the  jdk.internal.misc.Unsafe not grant to use except for jdk code, although it's a public class
        //System.out.println("The address(in jdk9 unsafe) size is: " + getUnsafeJdk().addressSize());
    }

    private static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field singleoneInstanceField = Unsafe.class.getDeclaredField("theUnsafe");
        singleoneInstanceField.setAccessible(true);
        return (Unsafe) singleoneInstanceField.get(null);
    }

//    private static jdk.internal.misc.Unsafe getUnsafeJdk() {
//       return jdk.internal.misc.Unsafe.getUnsafe();
//    }
}
