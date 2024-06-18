package week02.Lecture.collection;

import java.util.Map;
import java.util.HashMap;

public class Col6 {
    public static void main(String[] args) {



        // Map : key - value pair -> 중요!!
        // key라는 값으로 unique하게 보장이 돼야 함!! (key 중복 X)
        // Map -> HashMap, TreeMap으로 응용!

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 key
        intMap.put("삼", 15); // 중복 key
        intMap.put("삼", 16); // 중복 key


        // key 값 전체 출력(향상된 for문)
        for (String key : intMap.keySet()) { //intMap 에서 String 형의 key 가 하나씩 반복 , intMap에서 key만 빼서 배열로 만드는게 뭐냐? => keySet()
            System.out.println(key); // "이, 일, 삼" 만 출력 => 즉 중복된 key는 생략한다는 뜻.
        }


        // value 값 전체 출력(향상된 for문)
        for (Integer value : intMap.values()) { // 모든 value를 가져와서 배열에 담는다. 그 배열은 int형 배열임. 왜냐? => 위에  Map<String, Integer> intMap 이기 때문!
            System.out.println(value); // => "12, 11, 16" 만 출력 => 마지막에 쓴 놈으로 중복된 값들을 덮어쓰기 했다라고 이해할 수 있음
        }


        // key를 가지고 value를 찾아오는 방법
        System.out.println(intMap.get("삼")); // 16이 출력.
    }
}
