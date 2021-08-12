package com.why.start.asm;

public class HelloApp {
    public static void main(String[] args) {
        HelloAsmClassLoader helloAsmClassLoader = new HelloAsmClassLoader();
        try {
            Class<?> clazz = helloAsmClassLoader.loadClass("com.why.generate.Hello");
            Object hello = clazz.newInstance();
            System.out.println(hello);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
