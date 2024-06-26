/*

// 숫자 -> 문자

import : im(in) + port(항구)
즉 main.java 라는 코드 안 쪽으로 바깥에서 어떤 리소스를 가지고 오는것이 바로 import


import java.util.Scanner;

java.util 이 제공하고 있는 Scanner를 가져다 쓰겠다 라는 뜻.


    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // 입력한 값을 저장하게 함

            int asciiNumber = sc.nextInt(); // sc.nextInt()는 sc에 입력한 값을 nextInt()가 하나하나 읽음.
            char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.

            System.out.println(ch);
        }

    }



// 문자 -> 숫자

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
            int asciiNumber = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

            System.out.println(asciiNumber);
        }

    }
}


 */