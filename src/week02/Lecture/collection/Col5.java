package week02.Lecture.collection;

import java.util.*;

public class Col5 {
    public static void main(String[] args) {



        // [Set(집합) : 순서 없고, 중복 없음!!]
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // Set -> 그냥 쓸 수도 있음, 그러나, Hashset, TreeSet 등으로 응용해서 같이 사용 가능
        // Set을 생성자가 없는 껍데기라서 바로 생성할 수 없음!!!
        // 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있음!

        Set<Integer> intSet = new HashSet<>(); // 선언 및 생성  ( 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있음! )

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet) { //intSet에 있는 값들 하나하나가 value에 세팅이 되면서 반복문 출력.
            System.out.println(value); //1,5,9,12 만 출력 => 왜냐 중복이 되면 하나로 처리 == 집합의 개념(Set)
        }

        // contains (포함하느냐 라는 메서드)
        System.out.println(intSet.contains(2)); // intSet에 2를 포함하고 있니? 라는 뜻
        System.out.println(intSet.contains(5)); // intSet에 5를 포함하고 있니? 라는 뜻
        
    }
}
