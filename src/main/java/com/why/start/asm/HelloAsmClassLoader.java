package com.why.start.asm;

public class HelloAsmClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if ("com.why.generate.Hello".equals(name)) {
            byte[] dump = HelloAsm.dump();
            return defineClass(name, dump, 0, dump.length);
        }
        throw new ClassNotFoundException("不存在" + name);
    }
}
