package com.study.app5;

import java.io.Serializable;

// Serializable 이용
/*
* 자바에서는 Serializable을 많이 사용한다.
* Parcelable을 사용하기도 하지만 안드로이드에서는 자바에서 많이 사용하는
* Serializable을 사용
* */
public class Person implements Serializable{

    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){

        this.name = name;
        this.age = age;

    }

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
}
