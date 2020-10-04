package ru.mirea.pr6;

public class Student {
    private String name;
    private int grade;
    Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public String toString(){
        return "Name: "+name+" Grade: "+grade;
    }
}
