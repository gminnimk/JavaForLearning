package week02.Lecture.Week;

/*

연산 전에 두 피연산자의 타입이 다른 경우 타입을 일치시킵니다.

- 두 피연산자의 타입을 같게 일치시킨다. (둘중에 저장공간 크기가 더 큰 타입으로 일치)

    - 피연산자의 타입이 `int` 보다 작은 `short` 타입이면 `int`로 변환
    - 피연산자의 타입이 `long` 보다 작은 `int`, `short` 타입이면 `Long`으로 변환
    - 피연산자의 타입이 `float`보다 작은 `long`, `int`, `short` 타입이면 `float`으로 변환
    - 피연산자의 타입이 `double` 보다 작은 `float`, `long`, `int`, `short` 타입이면 `double`으로 변환
    - 이처럼, 변수 여러 개를 연산했을 때 결괏값은 피연산자 중 표현 범위가 가장 큰 변수 타입을 가지게 됩니다.

 */

public class W09 {
    public static void main(String[] args) {
        // 산술변환

        short x = 10;
        int y = 20;

        int z = x + y; // 결과값은 더 큰 표현타입인 int 타입의 변수로만 저장할 수 있습니다.

        long lx = 30L;
        long lz = z + lx; // 결과값은 더 큰 표현타입인 long 타입의 변수로만 저장할 수 있습니다.

        float fx = x; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float fy = y; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float fz = z; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
    }

}

