package week02.Lecture.Week;

//대입연산자
public class W05 {
    public static void main(String[] args) {
        // 변수를 바로 연산해서 그 자리에서 저장하는(대입하는) 연산자
        // =(기본대입연산자) , +=, -=, *= ....(복합대입연산자)\
        // ++ : += 1
        // -- : -= 1

        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        // 복합 대입 연산자
        number = 10;

        number += 2; // number = number + 2;
        System.out.println(number); // 12

        number -= 2; // number = number - 2;
        System.out.println(number); // 10

        number *= 2; // number = number * 2;
        System.out.println(number); // 20

        number /= 2; // number = number / 2;
        System.out.println(number); // 10

        number %= 2; // number = number % 2;
        System.out.println(number); // 0

        // ++, -- (복합 대입 연산자를 좀 더 간편하게 쓴 것)
        number ++; // number 라는 변수에 1을 더한 후에 대입해줘!
        number = number + 1;
        number += 1;
        // 위 세가지가 다 똑같은 말

        System.out.println("----------");
        number ++;
        System.out.println(number);

        number --;
        number = number - 1;
        number -= 1;

        System.out.println("----------");
        number --;
        System.out.println(number);


    }
}
