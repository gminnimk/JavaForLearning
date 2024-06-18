package week02.Lecture.collection;

import java.util.Stack;

public class Col3 {


        // Stack (바구니)
        // 수직으로 값을 쌓아놓고, 넣었다가 뺀다, FILO(Basket)
        // push(넣고), peek(조회), pop(꺼낸다) => 기억
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
        // Stack<Integer> intStack;

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10); // push로 바스킷안에 값을 넣음.
        intStack.push(15);
        intStack.push(1);



        // 다 지워질 때 까지 출력
        while (!intStack.isEmpty()) { // 이 바스킷이 비어있으면 true , 아니면 false 반환  => 위에 3개가 들어가 있으니까 false를 return
            System.out.println(intStack.pop()); // intStack.pop => 바스킷 맨 상단에 있는것만 위로 뺴주는것! , 즉 프린트 해주면서 값이 stack에서  빠져나감
        } // 1, 15, 10(역순으로)이 출력되고 반복문 종료가 됨

        // 다시 추가
        intStack.push(10); // push로 바스킷안에 값을 넣음.
        intStack.push(15);
        intStack.push(1);


        // peak(조회)
        System.out.println(intStack.peek()); // 1이 출력 (맨 위에 있는 놈을 조회)
        System.out.println(intStack.size()); // 3이 출력
        
    }
}

