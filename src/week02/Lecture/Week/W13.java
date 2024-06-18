package week02.Lecture.Week;


// 조건문으로 가위,바위,보 만들기!

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // A에게 값 입력받기
        System.out.println("A 입력:");
        String aHand = sc.nextLine();

        // B에게 값 입력받기
        System.out.println("B 입력:");
        String bHand = sc.nextLine();

        // 출력
        // A, B 유저중에 누가 이겼는지 출력

        // 두 개의 값을 비교하는 메서드 -> Objects.equals(좌, 우) : 좌 우가 같은 경우 true, 다른 경우 false
        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("비겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("B가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A가 이겼습니다.");
            } else {
                System.out.println("값을 잘못 입력하였습니다.");
            }
        }

        if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("비겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("B가 이겼습니다.");
            } else {
                System.out.println("값을 잘못 입력하였습니다.");
            }
        }

        if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("B가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A가 이걌습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("값을 잘못 입력하였습니다.");
            }
        }
    }
}
