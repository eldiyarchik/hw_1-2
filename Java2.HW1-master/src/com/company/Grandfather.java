package com.company;

import java.util.Arrays;

public class Grandfather {
    private int age;
    private String name;
    private double height;
    private Hobby hobby;
    private mobilePhone phone;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public mobilePhone getPhone() {
        return phone;
    }

    public Grandfather(int age, String name, double height, Hobby hobby, mobilePhone phone) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.hobby = hobby;
        this.phone = phone;
    }

    public final String getInfo() {
            return "Age: " + getAge() +
                    "\nName: " + getName() +
                    "\nHeight: " + getHeight()+
                    "\nHobby: " + getHobby() +
                    "\nMobile phone: " + getPhone() ;
    }
}
