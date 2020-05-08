package Objects;

public class One{


    public static void main(String[] args) throws Exception{
//        1.通过new关键字创建对象
        Person p1=new Person();
//        2.通过反射创建对象
        Person p2 = (Person) Class.forName("Objects.Person").newInstance();
//        3.使用clone方法复制对象
//                * 实现cloneable接口，没有抽象方法，只是个标记接口
//                * 重写clone方法
        Person p3 = (Person) p2.clone();
//            4.使用类构造方法创建
        Person p4 = Person.class.getConstructor().newInstance();



        
    }
}
