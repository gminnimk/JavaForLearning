package week02.Lecture.Week;

public class W16 {
    public static void main(String[] args) {

//        // while 문
//        while(조건문) { (연산) } 형태로 사용합니다. (while 문
//        int number = 0;
//        while (number < 3) { //while은 () 에 조건만 들어가면 됨 , number < 3인 동안~~
//            number++;
//            System.out.println(number + "출력");
//        }

        // do-while 문
        // do { (연산) } while(조건문) 형태로도 사용합니다. (do-while 문)
        int number = 4;
        do {
            System.out.println(number + "출력");
        } while (number < 3); // 연산을 한번 수행 후 조건문 체크
        // 조건이 최초에 만족하지 않더라도 어떤 작업은 무조건 선행이 되어야한다 라고 할 때 사용




        // break(깨부수다)
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단!
//        int number = 0;
//        while (number < 3) {
//            number ++;
//            if(number == 2) {
//                break;
//            }
//            System.out.println(number + "출력!!");
//        }


        // break 명령 범위
        // for

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
                }
            }
        }

//// 위 코드 출력
//        i: 0 // 바깥 반복문 부터 수행 시작
//        j: 0 // 안쪽 반복문 1회차 수행
//        j: 1
//        j: 2 // j 가 2일때 안쪽 반복문 break;
//        i: 1 // 바깥 반복문은 아직 break; 호출이 안됬으므로 다음 반복수행
//        j: 0 // 안쪽 반복문 2회차 수행
//        j: 1
//        j: 2 // j 가 2일때 안쪽 반복문 두번째 break;
//        i: 2 // i 가 2일때 바깥 반복문도 break; 호출되어 종료





//        // continue 명령
//
//        int number = 0;
//        while(number < 3) {
//            number++;
//            if (number == 2) {
//                continue;  // 2일때 반복 패스 , 하위의 로직을 패스하고 바로 다음 반복으로 넘어간다는 뜻
//            }
//            System.out.println(number + "출력");
//        }
//
//// 출력
//        1출력
//        3출력


    }
}
