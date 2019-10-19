package com.gysoft.gmall.a;

/**
 * @author 魏文思
 * @date 2019/10/16$ 14:39$
 */
public class HelloB  extends HelloA {
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("Im b Class");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new  HelloB();
    }
}
