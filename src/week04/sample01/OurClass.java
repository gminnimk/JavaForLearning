package week04.sample01;

public class OurClass {

    private final boolean just = true;


    // 위험해! 라고 플래그를 달아줄려면 throw 키워드를 이용해서

    // throw : 던지다!!(=예외를 던지다 / 발생시키다)

    public void thisMethodIsDangerous () throws OurBadException {
        // custom logic~!
        // 이 위험한 메서드가 실행이 될 떄는
        if (just) {
            throw new OurBadException();
        }
        // just로 들어왔다면
        // 새로운 OurBadException을 만들어서 던진다라는 뜻
        // 던질 수 있는 이유는  thisMethodIsDangerous () throws OurBadException 이렇게 위험하다고 플래그를 달아줬기 떄문에

    }
}
