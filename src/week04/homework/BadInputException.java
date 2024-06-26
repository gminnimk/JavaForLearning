package week04.homework;


// 4주차 과제에서 사용 할 예외.


public class BadInputException extends Exception {
    public BadInputException(String type) { // 이 type이라고 명시된 부분에 Parser 클래스에서 작성한 것 처럼 "정수값"이라고 표기한 부분이 대입.
        super("잘못된 입력입니다! " + type + "을 입력해주세요!"); // 즉, "잘못된 입력입니다! " + "정수값" + "을 입력해주세요!" 라고 예외가 발생하게 됨 .
    }
}