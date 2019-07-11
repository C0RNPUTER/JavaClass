package org.dimigo.Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d= new Dog("댕댕이");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();
        d.wag();

        Cat c = new Cat("냥이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호랑이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal d2 = new Dog("댕댕2");
        Animal c2 = new Cat("냥3");
        Animal t2 = new Tiger("티거");
        d2.bark();
        c2.bark();
        t2.bark();

        Animal[] animals = {
                new Dog("댕댕4"),
                new Cat("냥4"),
                new Tiger("티거2")
        };

        for(Animal animal : animals){
            doBark(animal);
        }
        Animal a2 = new Cat("야웅이");
        a2.eat();
        a2.bark();

        Cat cat = (Cat) a2;

        cat.scratch();

        System.out.println(d instanceof Dog);//t
        System.out.println(c instanceof  Cat);//t
        System.out.println(t instanceof  Tiger);//t
        System.out.println(d2 instanceof Cat);//f

    }


    private static void doBark(Animal animal) {
        if(animal instanceof  Cat) {
            Cat c = (Cat) animal;
            c.scratch();
        }
        else if(animal instanceof Animal){

        }
    }
}
