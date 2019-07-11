package org.dimigo.Inheritance;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, int height, int weight, String studentId) {
        super(name,age,height,weight);
        this.studentId = studentId;
    }

    public void studyAtNight(){
        System.out.println(getName() + "이/가 야자를 한다");
    }

    public void rollCall(){
        System.out.println(getName() + "이/가 점호를 한다");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
