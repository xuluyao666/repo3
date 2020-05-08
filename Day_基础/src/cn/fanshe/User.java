package cn.fanshe;

import java.lang.reflect.Field;

public class User {
    public static void main(String[] args) throws Exception {
        Class cla1 = Class.forName("cn.fanshe.Person");
        Class cla2 = Person.class;
        Person p=new Person();
        Class cla3 = p.getClass();
//        System.out.println(cla1);
//        System.out.println(cla2);
//        System.out.println(cla3);
//        System.out.println(cla1==cla2);
//        System.out.println(cla2==cla3);
//        System.out.println(cla);

        Field[] fields = cla1.getFields();
        for(Field field:fields){
            System.out.println(field);
        }
    }
}
