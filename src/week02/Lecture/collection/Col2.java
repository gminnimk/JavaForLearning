package week02.Lecture.collection;

import java.util.LinkedList; //LinkedList 를 사용하기 위한 import

public class Col2 {
    public static void main(String[] args) {

        // linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놔요.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.



        // 기본적 기능은 -> ArrayList와 동일

        // 기억하기!
        // LinkedList는 값 -> 여기 저기 나누어서 : 조회하는 속도가 "느리다..."
        // 값을 추가하거나, 삭제할 때는 빠릅니다.





        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // 선언

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString()); // 이렇듯 조회할 때는 arraylist보다 속도가 현저히 느리다.

        linkedList.add(200);
        System.out.println(linkedList.toString());

        linkedList.add(2, 4); // 2번 순번의 4라는 값을 추가해주세요.
        System.out.println(linkedList.toString());

        linkedList.set(1, 30); // 수정, 두 번째 있는 요소를 30으로 바꿈.
        System.out.println(linkedList.toString());

        linkedList.remove(1); // 두 번쨰 있는 요소를 삭제
        System.out.println(linkedList.toString());

        linkedList.clear(); // 전부 삭제
        System.out.println(linkedList.toString());
    }
}
