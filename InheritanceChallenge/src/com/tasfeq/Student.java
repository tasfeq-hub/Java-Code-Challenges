package com.tasfeq;

public class Student extends Person {

    private String rollNumber;
    private String classNumber;
    private double examMark;

    public Student(String name, String age, String gender, double height,
                   double weight, String rollNumber, String classNumber, double examMark) {
        super(name, age, gender, "Germany", height, weight);
        this.rollNumber = rollNumber;
        this.classNumber = classNumber;
        this.examMark = examMark;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public double getExamMark() {
        return examMark;
    }

    public double getTotalMarks(){
        return examMark;
    }

    public void setExamMark(double examMark){
        this.examMark+=examMark;
    }

    public void graduate(){
        super.isEducated(true);
        System.out.println("Graduation completed! ");
    }
}
