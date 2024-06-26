package week04.homework;

// 계산기를 실행시켜주는 클래스.

import java.util.Scanner;

public class CalculatorApp {


    //start 라는 메서드는 Exception 으로 위험 표시가 되어 있기 떄문에
    // try - catch로 감싸줘야함

    public static boolean start() throws Exception{

        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        String firstInput = scanner.nextLine();
        parser.parseFirstNum(firstInput);

        System.out.println("연산자를 입력해주세요!");
        String operator = scanner.nextLine();
        parser.parseOperator(operator);

        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = scanner.nextLine();
        parser.parseSecondNum(secondInput);

        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;
    }


}