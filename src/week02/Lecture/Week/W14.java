package week02.Lecture.Week;

public class W14 {
    public static void main(String[] args) {
        int month = 8;
        String monthStirng = "";

        // switch문
        // if문 보다 가독성이 좋음
        // switch(피연산자) { case(조건): 연산) } 형태로 사용.
        // 연산문 마지막에는 break; 를 꼭 기입해야함.
        // default: (연산)은 아무것도 만족하지 않을때 수행. == if에서는 else와 같은 역할

        switch (month) {
            // case~~~ 연산
            case 1:
                monthStirng = "1월";
                break;
            case 2:
                monthStirng = "2월";
                break;
            case 3:
                monthStirng = "3월";
                break;
            case 4:
                monthStirng = "4월";
                break;
            case 5:
                monthStirng = "5월";
                break;
            case 6:
                monthStirng = "6월";
                break;
            case 7:
                monthStirng = "7월";
                break;
            case 8:
                monthStirng = "8월";
                break;
            case 9:
                monthStirng = "9월";
                break;
            case 10:
                monthStirng = "10월";
                break;
            case 11:
                monthStirng = "11월";
                break;
            case 12:
                monthStirng = "12월";
                break;
            default:
                monthStirng = "알 수 없음";
        }
        System.out.println(monthStirng);
    }
}
