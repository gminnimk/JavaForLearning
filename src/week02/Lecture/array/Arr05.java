package week02.Lecture.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자(char / 1byte), 문자열(String)
        // Stirng = char []

        // [기본형 변수 vs 참조형 변수]
//      // 1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 '대문자로 시작함'
//      //    -Wrapper class에서 기본형 변수를 감싸줄 떄(boxing), int -> Integer
//      // 2. 본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(= 주소형 변수)

        // char < Stirng (String이 훨씬 더 많이 쓰임!)
        // String이 가지고 있는 기능이 너무 많아서..!!!
        // Wrapper class와도 상당히 비슷..! -> 기본형 벼눗가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper를 감쌈으로써 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength); // 4가 출력됨

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar); // B가 나옴

        // (3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0, 3); // substring은 짤라서 새로운 스트링을 주겠다 라는 말.
        System.out.println(strSub); //ABC 출력 => 0번쨰 부터 3번째 전까지 출력

        // (4) equals(Stirng str)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str); // 입력받은 스트링과 같은지 물어보는 것, 따라서 output은 true or false가 출력
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char[]  // 스트링을 캐릭터로 이루어진 어레이로 변환하는 메서드
        char[] strCharArray = str.toCharArray();

        //(6) 반대로 char[] -> String -> char // 캐릭터 어레이를 스트링으로 스트링을 캐릭터로 변환
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // new String으로 문자열 형태로 변환
        System.out.println(charArrayString);

    }
}
