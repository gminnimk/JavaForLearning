package week02.Lecture.Week;

public class W02 {
    public static void main(String[] args) {
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2
        System.out.println(2 / 4); //0
        System.out.println(4 % 2); //0
        System.out.println(5 % 2); //1
        System.out.println("----------------");

        // 우선순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 18;
        int c;

        // 덧셈
        c = a + b;
        System.out.println(c); //30

        // 뺼셈
        c = a - b;
        System.out.println(c);

        // 곱셈
        c = a * b;
        System.out.println(c);

        //나눗셈(몫)
        c = a / b;
        System.out.println(c);

        // 나눗셈(나머지)
        c = a % b;
        System.out.println(c);

    }
}
