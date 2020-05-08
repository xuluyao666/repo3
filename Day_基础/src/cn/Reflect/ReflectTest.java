package cn.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
//        Person p=new Person();
//        p.eat();


        InputStream is = ReflectTest.class.getClassLoader().getResourceAsStream("pro.properties");
        Properties pro=new Properties();
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cla = Class.forName(className);
        Object obj = cla.newInstance();
        Method method = cla.getMethod(methodName);
        method.invoke(obj);


    }



}
