package com.gysoft.gmall.test;

import com.sun.tools.javac.util.List;

/**
 * @author 魏文思
 * @date 2019/8/26$ 16:12$
 */
public class ExtendsTest {

    public static void main(String[] args) {
            InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
            s.addAll(List.of("Snap", "Crackle", "Pop"));
            System.out.println(s.getAddCount());
    }
}
