package week02.Lecture.collection;

import java.util.ArrayList; // ArrayList는 반드시 import 해야함.



public class Col1 {
    public static void main(String[] args) {

// 컬렉션 => List, Set, Queue, Map


        // List
        // 순서가 있는 데이터의 집합 => Array 와 상당히 비슷(최초 길이를 알아야 함)
        // Array와 다른점은 처음에 길이를 몰라도 만들 수 있음!


        // 1) Array -> 정적배열 (기억하기 )
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다) ( 기억하기 )
        //  - 생성 시점에 작은 연속된 공간을 요청해서 참조형 번수들을 담아놓는다.
        //  - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니깐 상관없다!!


        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성 , 리스트를 만든 것
        // ArrayList는 동적배열이기 때문에 값을 언제든지 추가할 수 있음.

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(0)); // get(1) => 두 번째로 추가된 값이 잡힘 , 즉 15 출력

//        2번째 있는 값(15)를 바꿔보자.
        intList.set(1, 10); // intList에 있는 set이라는 메서드를 이용해서 (1,10) => 첫 번째 값을 10으로 바꾸자! 라는 뜻.
        System.out.println(intList.get(0)); // 15 => 10

        System.out.println(intList.get(1));



        // 삭제
        intList.remove(0); // 첫 번째 값인 99가 삭제되고 두 번째 값이 첫 번째 값으로 변경 => 15가 출력
        System.out.println(intList.get(0));


        // 클리어
        System.out.println("클리어 전"); // [15,3] 이 출력
        System.out.println(intList.toString()); // toString => 리스트안에 있는 값을 사람이 볼 수 있게끔 편하게 만들어 주는 명령어.
        intList.clear();
        System.out.println("클리어 후"); // [] 출력
        System.out.println(intList.toString());

    }
}
