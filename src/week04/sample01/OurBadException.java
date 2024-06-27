package week04.sample01;


// 예외 클래스를 만들어서 예외를 정의!
public class OurBadException extends Exception {
    public OurBadException() {
        super("위험한 행동을 하면 예외처리를 꼭 해야함!!");
        //suepr : 부모 클래스의 생성자를 호출
    }
}

// 예외 클래스를 만들었다고 생각하기
// 이런 클래스를 통해서 예외를 정의한다 정도로 알아두기
