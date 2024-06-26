//package week03;
//
//// Car 클래스를 우리가 만들었으니까 이 만들어진 클래스를 객체화를 하여 사용할 수 있음
//// 클래스는 객체를 만들기위한 설계도!
//// 이 Car 클래스를 가지고 많은 객체들을 찍을 수 있음.
//
//public class Main {
//    public static void main(String[] args) {
//
//
////        Car car1 = new Car(); // 설계도(Car 클래스)를 이용해서 신규의 객체를 만들때는 new 키워드를 만든다, 즉 생성자를 불러내기 위해 new 키워드를 사용함.
////        Car car2 = new Car();
////
////
////        System.out.println(car1); //여기서 car1은 car1이 갖고있는 주소라고 이해하면 됨
//
//
////        Car[] carArray = new Car[3]; //Car로 이루어진 길이 3의 배열을 생성
////        Car car1 = new Car();// 새로운 객체 생성
////        car1.changeGear('P'); // car1에 changeGear 라는 메서드를 이용해서 Gear를 'P'로 바꿔줌
////        carArray[0] = car1; // car1을 carArray라는 배열 0번째에 넣음.
////
////        Car car2 = new Car();// 새로운 객체 생성
////        car2.changeGear('N'); // car1에 changeGear 라는 메서드를 이용해서 Gear를 'P'로 바꿔줌
////        carArray[1] = car2; // car1을 carArray라는 배열 0번째에 넣음.
////
////        Car car3 = new Car();// 새로운 객체 생성
////        car3.changeGear('D'); // car1에 changeGear 라는 메서드를 이용해서 Gear를 'P'로 바꿔줌
////        carArray[2] = car3; // car1을 carArray라는 배열 0번째에 넣음.
////
////        for (Car car: carArray) { //향상된 for문, 변수타입이 car인 애들이 하나하나 할당되도록 carArray 를 지정하면 car는 carArray가 가지고있는 요소 3개가 하나씩 할당되면서 car에 들어감
////            System.out.println("car.gear =  " + car.gear);
//
//
////        Car car = new Car(); // 객체 생성 = 인스턴스화
////
////        // 초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
////        System.out.println("car.model = " + car.model);
////        System.out.println("car.color = " + car.color);
////        System.out.println();
////
////        System.out.println("car.speed = " + car.speed);
////        System.out.println("car.gear = " + car.gear);
////        System.out.println("car.lights = " + car.lights);
////        System.out.println();
////
////        System.out.println("car.tire = " + car.tire);
////        System.out.println("car.door = " + car.door);
////        System.out.println();
////
////        // 필드 사용
////        car.color = "blue"; // 필드 color에 "blue" 데이터를 저장
////        car.speed = 100;
////        car.lights = false;
////
////        // 갹체에 우리가 필드에 접근해서 필드를 사용하는 것
////        // 사용이라는 건 읽기도하고 수정도 함
////
////        System.out.println("car.color = " + car.color);
////        System.out.println("car.speed = " + car.speed);
////        System.out.println("car.lights = " + car.lights);
//
//
//        Car car = new Car(); // 객체 생성
//
//
//        // 메서드 호출 및 반환값을 저장
//        double speed = car.gasPedal(100, 'D');
//        System.out.println("speed = " + speed);
//
//        boolean lights = car.onOffLights();
//        System.out.println("lights = " + lights);
//
//        System.out.println();
//        System.out.println(" 페달 밟고 난 후의 car.gear = " + car.gear);
//
//        System.out.println();
//        car.carSpeeds(100, 80);
//        System.out.println();
//        car.carSpeeds(110, 120, 150);
//    }
//}
