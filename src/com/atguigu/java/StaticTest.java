package com.atguigu.java;

/**
 * @author msstart
 * @create 2018-08-10 18:52
 */
public class StaticTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.show();
        p.say();
        p.info();
        Person.info();
    }
}

class Person {

    static String country;
    int age;
    String name;

    public void show() {

        System.out.println(country + " " + age + " " + name);
    }

    public void say() {

        System.out.println("say");
        info();
        System.out.println(country);
    }

    public static void info() {

        System.out.println("info" + country);
    }
}
