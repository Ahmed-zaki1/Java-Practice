package com.practice;

import java.util.HashSet;

class Student{
int id;
String name;
Student(int id,String name){
this.id=id;
this.name=name;

}
}
class Emp{
public static void main(String[]args){
Student s=new Student(1,"rizwan");
Student s1=new Student(1,"rizwan");

HashSet<Student> hs=new HashSet<Student>(); 
hs.add(s);
hs.add(s1);
System.out.println(hs.size());

}
}