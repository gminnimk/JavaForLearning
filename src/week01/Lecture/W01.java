/*




■ 컴파일러 : java 라는 파일을 class 라는 파일로 변환해주는 파일이다.

    - java는 운영체제가 읽을 수 없으니까 바이트 코드(class 파일) 로 바꿔서 컴퓨터가 이해하게!



■ 클래스 : 설계도




■ public class Main {   // class 라는 키워드로 Main 이라는 클래스를 만들것

    - 자바 프로젝트는 제일 먼저 클래스의 main 메서드를 실행시킨다. = JVM의 약속

    - public : (접근)제어자(어디까지 접근하게 할거냐 라는 말), public(공공의, 공동의)

        - ex) public class Main => public 으로 Main 클래스를 만들어 놓으면 src 폴더에 있는 Main 클래스는 어디서든 접근 가능하게 해줌

        - 즉 외부에서도 실행시킬 수 있게 해준다 라고 이해하면 됨.



■ [JDK] = Java Development Kit 즉, 자바 개발 키트

        - JDK가 갖고 있는 기능 3가지

        (1) compiler : .java => .class
        (2) JRE 실행환경을 갖고 있음
        (3) JDB : 디버깅 : 버그를 없애기 위해서 코드를 면밀히 살펴보는 과정



■ 메서드 : 프로그램이 하는 행동을 정의 ex) 사람이 걷다, 하품을하다 등등

    - 클래스의 하위요소 = 메서드





■ public static void main(String[] args) { // 소괄호 바로 앞에 있는게 이름 = 즉 main 메소드 , args 대신 아무거나 작성해도 상관 X

    - static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

    - output
        - void : 메서드의 출력값의 데이터 타입 (위치, void 자리에 String, double 등 데이터 타입이 들어가는 자리)
        - void : "아무것도 없다." -> 출력은 없다.(출력이 없는 메서드, 출력을 해줄려면 return이 필요!) /  void는 output

    - input
        - String[] args : 매개변수 자리 / input의 자리

    - main은 우리의 playground!



■ 객체 : 세상에 존재하는 모든 것( (1).특징(속성, 변수), (2).행동(메소드) )

    - System.out.println("Our First Project! :)"); // out이 객체, 이 객체가 println 이라는 행동 즉 메서드를 포함하고 있다.


■ 변수 : 변하는 저장공간(그릇)

■ 상수 : 변하지 않는 저장공간


■ Int number; // int는 저장공간 타입, number는 저장공간 이름


■ 기본형 변수 vs 참조형 변수

    (1). 기본형 변수

    실제 값을 저장하며 아래와 같이 8가지가 있다.

    ex)
    boolean
    char
    byte, short, int, long(l) // 선언시 뒤에 l 써줘야함. float도 마찬가지
    float(f), double


    특징은 다음과 같다.

    산술 연산이 가능함.
    null로 초기화 할 수 없음.



    (2). 참조형 변수 : 큰 데이터를 저장하기 위한 별도공간

    어떤 값이 저장되어 있는 주소를 값으로 가진다. 8개의 기본형을 제외한 나머지 모든 타입

    ex> Integer, Boolean, String, Object, Array, List...


    특징은 다음과 같다.

    산술 연산 불가
    null로 초기화 할 수 있음.
    DB와 연동시 DTO 객체에 null이 필요한 경우 사용 할 수 있음











■ 참조형변수타입 및 래퍼클래스타입 실습


[1] 기본형

    (1) boolean

        변수를 선언해보자 => 타입 이름 = 값;

        boolean flag = true;

        flag = false;

        System.out.println(flag);


    (2) 문자형(char) : 문자 한개만 저장

        char alphabet = 'A';
        System.out.println(alphabet);


    (3) 정수형(byte, short, int, long)

        byte byteNumber = 127; // -128 ~ 127(1byte) = 8bit bit: 0과 1을 표현
        short shortnumber = 32767; // -32,768 ~ 32,767
        int intnumber = 2147483647;
        long longnumber = 2147483647;

        System.out.println(byteNumber);
        System.out.println(shortnumber);
        System.out.println(intnumber);

    (4) 실수형

        float(4byte), double(8byte)

        float floatNumber = 0.123F;
        double doubleNumber = 0.1231232123;


        변수를 쓴다는 건 변수를 참조한다 라고 표현 함
        System.out.println(floatNumber);
        System.out.println(doubleNumber);



[2] 참조형


        (1) 문자열 변수(String) : 문자 여러개를 문자형태로 저장

            String helloWorld = "Hello world";

            System.out.println(helloWorld);


        (2) 배열

            int[] a = {1, 2, 3};

            System.out.println(Arrays.toString(a));



■ 래퍼 클래스(Wrapper Class 변수)

            int number = 21; // int형 number 변수에 21 값 저장


            (1). Boxing : 기본 타입 에서 래퍼 클래스
            ex) int => Integer
            Integer num = number; // boxing

            (2). UnBoxing : 래퍼클래스 에서 기본 타입으로
            ex) Integer => int
            System.out.println(num.intValue()); // unboxing


 */