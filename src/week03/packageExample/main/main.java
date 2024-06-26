package week03.packageExample.main;


import week03.packageExample.pk1.Car;

public class main {
    public static void main(String[] args) {
//        // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
//        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
//        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
//
//
//
//        // 다른 패키지에 접근할 떄는 항상 경로를 적어줘야 하는 것 숙지
//        car1.horn();
//        car2.horn();


        // import는 다른 패키지에 있는 거를 내부 소스로 가져오는 방법을 통해서도 객체를 생성을 가능하게 함

        Car car = new Car();
        week03.packageExample.pk2.Car pkCar = new week03.packageExample.pk2.Car();


        car.horn();
        pkCar.horn();
    }
}
