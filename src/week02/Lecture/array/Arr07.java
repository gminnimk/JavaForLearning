package week02.Lecture.array;

public class Arr07 {
    public static void main(String[] args) {

        // 가변배열 : 2차원 배열에서 열의 길이를 생략하는 것
        // ㄴ 아래 두 가지 방법으로 열의 길이를 가변적으로 길이를 지정할 수 있음.
        int[][] array = new int[3][]; // 2차원 배열을 생성할때 열의 길이를 생략할 수 있음.




        // 배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];


        // 중괄호로 초기화를 아예 해버릴 때도 가능함!!
        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };
    }
}

