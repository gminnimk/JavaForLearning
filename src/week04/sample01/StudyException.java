
// 인스턴스화 시켜서 처리를 하는 로직

package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally 구문
        // try : 시도하다
        // catch : 잡다(붙잡다)
        // finally : 마침내

        // 일단 try해 ~~~ 그리고, 예외가 발생하면 그걸 잡아!!(catch),
        // 그리고, 정상적으로 수행되든, 예외가 발생하든 결국, 마침내 수행되야 하는 로직을 'finally' 수행해..!!
        // 위 두 줄에 전부다 로직이 들어가 있다고 이해하면 됨.



        try {
            // 일단 실행 !!!
            ourClass.thisMethodIsDangerous();
        }
        // 만약 문제가 발생한다면
        catch (OurBadException e) { //무슨 종류의 예외 상황을 catch 할 것인지를 알기위해 소괄호()가 있어야 함. // 우리가 OurClass 클래스에서 명시해놨던 플래그는 OurBadException
            //OurBadException 을 catch 하고 중괄호안에 사용할 수 있게끔 변수명을 지정.  == 인스턴스화
            System.out.println(e.getMessage()); // e가 가지고 있는 오류 내용 즉 메시지를 출력해줌

        }
        finally {
            // 무조건 여기는 거침
            System.out.println("우리는 방금 예외를 handling 했습니다. 정상처리되든, 예외사항이 발생하든 여기를 거쳐요!!!");

        }


    }
}
