package io.javabrains.Unit1;

public class Person {
    private String Fname;
    private String Lname;
    private int Age;

    public Person(String fname, String lname, int age) {
        Fname = fname;
        Lname = lname;
        Age = age;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", Age=" + Age +
                '}';
    }
}
