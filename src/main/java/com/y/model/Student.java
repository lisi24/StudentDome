package com.y.model;

public class Student {

    private int id;

    private String stuname;

    private String sex;

    private int age;

    public Student(int id, String stuname, String sex, int age) {
        this.id = id;
        this.stuname = stuname;
        this.sex = sex;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
