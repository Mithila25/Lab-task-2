/*
Name    : Mithila Talukdar
ID      : 2012020056
Section : B
email   : cse_2012020056@lus.ac.bd
Date    : 09-08-2021
 */
package mithila;

public class Student {
    String name;
    int id;
    static String universityName = "Leading University";

    Student()
    {
        //System.out.println("Student class have a default constructor!");
    }

    Student(int id)
    {
        this.id = id;
    }

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
        System.out.println("Student Name: "+this.name);
        System.out.println("ID: "+this.id);
    }

    void display()
    {
        System.out.println("University Name: "+universityName);
    }
}
