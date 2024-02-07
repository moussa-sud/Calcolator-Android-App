package com.example.normal;
public class Person {

    private String name;
    private String birthday;
    private String sex;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for birthday
    public String getBirthday() {
        return birthday;
    }

    // Setter for birthday
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Getter for sex
    public String getSex() {
        return sex;
    }

    // Setter for sex
    public void setSex(String sex) {
        this.sex = sex;
    }
}
