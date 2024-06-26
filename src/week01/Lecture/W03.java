/*


[ 형 변환 예제 : 변수의 타입을 바꾸는 방법 ]

 문자열 -> 숫자 (보류)


■ 변수 타입별 크기 순서

        - byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        작은타입의 크기에서 큰 크기의 타입으로 저장될때 자동으로 타입 변환이 일어난다는 것이 핵심!

        반대로 큰 타입에서 작은 타입으로 변환 하는것을 "강제 형 변환" 이라고 함. => 손실이 발생.

        작은 크기의 타입이 큰 크기의 타입과 '계산'될 때,
        자동으로 큰 크기의 타입으로 형 변환이 된다.

           ex)
           int int Number = 10;
           double doubleNumber = 5.5;
           double result = intNumber + doubleNumber;

           System.out.println("Plus =>" + result);

           1) 정수로 나누기
           int iResult = intNumber / 4;

           2) 실수로 나누기
           double dResult = intNumber / 4.0;

           System.out.println(iResult + " / " + dresult);





■ 정수 -> 실수

        int intNumber = 10;

        double doubleNumber = (double)intNumber;
        float floatNumber = (float)intNumber;

        System.out.println("intNumber => " intNumber);
        System.out.println("doubleNumber => " doubleNumber);
        System.out.println("floatNumber => " floatNumber);





■ 실수 -> 정수

        double형 or float형 -> int
        실수 -> 정수 (0.xxx -> o)
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        변환(int)
        int intNumber;
        intNumber = (int)floatNumber;

        System.out.println("Float Type => " floatNumber);
        System.out.println("Int Type => " intNumber);


    }
}

 */
