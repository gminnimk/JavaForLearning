package week02.Lecture.array;

public class Arr06 {
    public static void main(String[] args) {

        // 2차원 배열
        
        // 반복문을 통한 초기화
        int[][] array = new int[2][3]; // 최초 선언 , 첫 번째 배열 크기 2, 두 번째 배열 크기 3

        for (int i=0; i < array.length; i++) { // 첫 번째 for문은 첫 번째 배열에 대해 / 0과 1이 순환
            for (int j=0; j < array[i].length; j++) { // 두 번째 for문은 두 번째 배열에 대해 작동 / 0,1,2가 순환
                System.out.println("출력값 =>" + i + ", " + j);
                array[i][j] = 0; // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
            }
        }
    }
}
