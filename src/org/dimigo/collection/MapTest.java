package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //2 . Map 계열 : HashMap
        //key, value 쌍으로 구성
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 60);
        map.put("mat", 60);
        map.put("eng", 60);
        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        printMap(map);

        map.clear();
        printMap(map);

        //map : key(String), value(List<String>)
        Map<String, List<String>> map2 = new HashMap<>();

        //List : Map<String, String>
        List<Map<String, String>> list2 = new ArrayList<>();


    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()){
            System.out.print(key + ":"+map.get(key)+"|");
        }
        System.out.println();
    }
}
