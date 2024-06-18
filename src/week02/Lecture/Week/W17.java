package week02.Lecture.Week;

import java.util.Scanner;

//for

public class W17 {
    public static void main(String[] args) {

        // 입력한 단 빼고 출력
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();
        int i, j;

        for (i = 2; i <= 9; i++) {
            if (i == passNum) {
                continue;
            }
            for (j = 2; j < 9; j++) {
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
        }
    }
}



// 특정한 단만 출력

//Scanner sc = new Scanner(System.in);
//int passNum = sc.nextInt();
//        int i, j;
//
//        for (i = 2; i <= 9; i++) {
////            if (i == passNum) {
////                continue;
////            }
////            for (j = 2; j < 9; j++) {
//        System.out.println(passNum + "곱하기" + i + "는" + (passNum * i) + "입니다.");
////            }
//
//        }
//        }
//        }
