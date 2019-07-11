package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"광주","신안","대구","부산","라도","쌍도","멍청도"};
        //출력
        System.out.println(Arrays.toString(src));
        //복제
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));
        //비교
        System.out.println(Arrays.equals(src,dest));
        //정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));
        // 배열 검색 ( 정렬필요)
        System.out.println(Arrays.binarySearch(dest, "라도"));
    }
}
