package week02.Lecture.Week;

public class W06 {
    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점!!
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + b--; // 11 + 9 = 20
        System.out.println(a); //11
        System.out.println(b); //9
        System.out.println(val); //21

        // ++a : 1을 증가시킨 후 대입해줘 라는 뜻
        // b-- : 대입한 후에  1 감소해줘 라는 뜻
        // 그래서 val 값은 21이지만(연산 전) 따로 b를 출력해보면 9가 나옴(연산 후)
    }
}
