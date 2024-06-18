package week02.Lecture.Week;
/*
[연산자 우선순위 : 산술 > 비교 > 논리 > 대입]

- 연산자 여러개가 함께 있는 연산을 계산할때는 우선순위가 있습니다.
- 위 우선순위에 따라서 최종적인 응답값이 결정됩니다.
- 단, 괄호로 감싸주면 괄호안의 연산이 최우선순위로 계산됩니다.

 */

public class W08 {

    public static void main(String[] args) {

        // [연산자 우선순위 : 산술 > 비교 > 논리 > 대입]
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x <y && y < z; // true && true
        System.out.println(result);
        System.out.println("-----");

        result = x + 10 < y && y < z; // false && true
        System.out.println(result);
        System.out.println("-----");

        result = x + 2 + 3 > y;
        System.out.println(result);

        result = (x+2) * 3 > y; //true
        System.out.println(result);
    }
}
