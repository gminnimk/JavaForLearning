package week02.Lecture.Week;

/*
- 비트 연산

        - Byte를 8등분 한 게 Bit라고 말씀 드린 거 기억하시죠?
        - Bit는 0,1 둘 중의 하나의 값만을 저장하는 컴퓨터가 저장(표현) 가능한 가장 작은 단위라고 말씀드렸습니다.
        - 컴퓨터의 가장 작은 단위인 Bit이기 때문에 연산중에서 Bit 연산이 제일 빠릅니다.
        - 물론 이전에 배운 대로 0,1 값으로 산술연산을 하거나, 비교 연산을 할 수 있지만 비트 연산을 통해 자릿수를 옮길 수도 있습니다.
        - 이처럼 Bit의 자릿수를 옮기는 것을 비트 연산이라고 합니다.
        - `<<`(왼쪽으로 자릿수옮기기), `>>`(오른쪽으로 자릿수옮기기)
        - 0,1 은 2진수 값이기 때문에,
        - 자릿수를 왼쪽으로 옮기는 횟수만큼 2의 배수로 곱셈이 연산되는 것과 동일합니다.
        - 자릿수를 오른쪽으로 옮기는 횟수만큼 2의 배수로 나눗셈이 연산되는 것과 동일합니다.

        1010 -> 0101
 */


public class W10 {
    public static void main(String args[]) {

        System.out.println(3 << 2); // 이 부분 강의 다시 복습
        System.out.println(3 << 1); // 이 부분 강의 다시 복습
    }
}











