package org.dimigo.Inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person("아이유",26,162,48);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("김한샘",18,180,70,"2509");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.studyAtNight();
        s.rollCall();

        Teacher t = new Teacher("SSPARK",30,190,65,"정통보신");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.doTask();

    }
}
