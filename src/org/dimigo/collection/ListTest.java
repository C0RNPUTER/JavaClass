package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
//        //1.List계열 : ArrayList
//        List list = new ArrayList();
//        list.add("홍길동");
//        list.add(100);
//        list.add(new Dog("고길동"));
//        String s = (String) list.get(0);

        //제너릭(Generic)
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        list.set(2,"바나나");
        printList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);

        list.clear();
        printList(list);

    }

    private static void printList(List<String> list) {
        for(String value : list ) {
            System.out.print(value + " | ");
        }
    }
}
