package week02.Lecture.collection;

import java.util.*;

public class Col4 {
    public static void main(String[] args) {


        // Queue(원통) : FIFO , 빨대를 넣으면 한쪽에서 넣고 한쪽에서 빠지는걸 생각하면 됨.
        // add(넣는거), peek(조회), poll(꺼내는거)
        // Queue : 생성자가 없는 인터페이스 <-

        Queue<Integer> intQueue = new LinkedList<>(); // Queue를 선언, 생성 Queue는 Stack등 다른 컬레션들과 달리 선언방식이 다름 ,

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()) { //intQueue가 비어있지 않을때 계속 반복문을 실행해라 라는 뜻
            System.out.println(intQueue.poll()); // poll => 값을 뺴는것, poll 하면서 빠져나온게 sout으로 출력이 되는것!
        }

        // 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);


        // peek
        System.out.println(intQueue.peek()); // peek = 조회 / 1이 출력 ( 제일 먼저 넣은게 제일 먼저 출력이 되었다 == FIFO )
        System.out.println(intQueue.size()); //

    }
}
