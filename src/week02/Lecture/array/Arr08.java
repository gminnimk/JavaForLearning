package week02.Lecture.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        // 최대값 초기화 세팅
        int max = arr[0];

        // int min = arr[0];  최소값

        // 최대값 구하기 로직
        for (int num: arr) { // arr = {3, 2, 1, 5, 1} 에 있는 값 하나하나씩 돌아가면서 num에 할당!
            if (num > max) {
                max = num; // num이 max보다 클때 max를 num으로 바꿔줌.
            }
        }
        System.out.println("최대값은 => " + max);
    }
}





// 최소값 구하기 로직

//public class Arr08 {
//    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 4, 5};
//
//        int min = arr[0];
//
//        for (int num : arr) { // arr에 있는 값들을 하나하나씩 돌려봄.
//            if (num < min) {
//                min = num;
//            }
//            System.out.println("최소값은 => " + min);
//        }
//    }
//
//        }
//    }
//}