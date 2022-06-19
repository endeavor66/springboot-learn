package org.example;

public class HelloService {
    String name;
    int age;

    public HelloService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("hello, name:%s, age:%d\n", name, age);
    }
}
