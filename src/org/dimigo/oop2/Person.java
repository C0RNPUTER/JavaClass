package org.dimigo.oop2;

public class Person {
    private final String type = "영장류";
    private final String birthdate;

    public static final String TYPE = "영장류"; // 진정한 자바의 상수선언

    private String name;

    public Person(String birthdate, String name) {
        this.birthdate = birthdate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020101", "홍길동");
        Person p2 = new Person("20020201", "홍길순");
        System.out.println(p1);
        System.out.println(p2);

//        p1.type = "파충류";

    }

}
