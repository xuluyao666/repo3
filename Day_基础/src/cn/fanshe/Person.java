package cn.fanshe;

public class Person {
    private String name;
    private int age;
    public String a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                '}';
    }
}
