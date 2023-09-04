package com.prepus;

 public class Student {
    //member variable
    private int rollNo;
    private String name;

     public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    //Member method
//    public void setData(int rollNo, String name){
//        this.rollNo = rollNo;
//        this.name = name;
//    }
//    public void display(){
//        System.out.println("Student id is: " + rollNo + " " + "and name is " + name);
//    }

     static{
         System.out.println("Static Block");
     }
     {
         System.out.println("Instance Block");
     }
     @Override
     public String toString() {
         return "Student{" +
                 "rollNo=" + rollNo +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
