//// HW. 3주차 숙제
//
//// 계산기 만들기
//
//
//
//package week03.homework;
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class Calculator {
//
//
//
//    // Step 3
//
////3️⃣ AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를 만든 후 클래스 간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
////
////        - 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경합니다.
////    - 나머지 연산자(%) 기능은 제외합니다.
////        - Step 2 와 비교하여 어떠한 점이 개선되었는지 스스로 생각해 봅니다.
////        - hint. 클래스의 책임(단일 책임 원칙)
//
//
//// Step 3 > 클래스를 각각 만들어서 관계를 맺도록 하는 예제
//// 즉 관계를 맺기 위해서 우리가 이 프로젝트 안에서 Calculator 뿐만 아니라 Add, Substract, Multiply, Dvide Operation를 만들어야 함
//// 그 다음 생성자를 만들고 원래는 기본 생성자를 썻었지만 addOperation, sO , M, DivideOperation 등 다 들어와야지 계산기가 완성되는거기 때문에 생성자를 만들것
//
//    private final AddOperation addOperation; // final => 변경 x , 상수처럼 사용
//    private final SubstractOperation  substractOperation;
//    private final MultiplyOperation  multiplyOperation;
//    private final DivideOperation  divideOperation;
//// 위 4개를 내부 뱐수로 만들어주고
//
//    private AbstractOperation operation;
//
//    public Calculator (AbstractOperation operation) {
//        this,operation = operation;
//    }
//
//
////
//
//    public Calculator ( // 생성자 선언 => 클래스 네임과 똑같이 그 다음에는 처음에 이 인스턴스 만들때 뭐가 들어와야 하냐면은
//                        AddOperation addOperation,
//                        SubstractOperation substractOperation,
//                        MultiplyOperation multiplyOperation,
//                        DivideOperation divideOperation;
//                  ) // 그러면 이 4개를 어디다가 저장을 할 거냐 ? 이 클래스 내부의 별도의 변수에 저장을 해야함!
//    // 그러기 위해서는 클래스 내부 변수를 선언해야함! ..{ // 이 생성자 안에서는 내부변수에 대입을 시켜주는 것(아래 방식으로)
//    {
//        this.addOperation = addOperation;
//        this.SubstractOperation = SubstractOperation;
//        this. MultiplyOperation =  MultiplyOperation;
//        this.DivideOperation = divideOperation;
//        // 이렇게 지정을 해주면 최초의 인스턴스가 생성이 될때 자동으로 들어가게 되는 것
//    }
//
//
//    //위 절차까지 마치면 아래 Calculator class로 이동해서
//    // 기존 operate 작동방식을 바꿔줌
//
//
//// Step 1
//
////1️⃣ 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.
////
////        - Calulator 클래스는 연산을 수행하는 반환 타입이 double인 calculate 메서드를 가지고 있습니다.
////        - calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
////        - int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
////        - calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.
//
//    public double calculate(String operator, int firstNumber, int secondNumber) { // 이 클래스 안에서 실제로 계산을 수행하는 메서드를 생성, () 안에는 첫번째 연산자 두번째 피연산자가 들어가야 함
//        // 즉 firstNumber, secondNumber의 두 피연산자를 operator 라는 연산자로 계산을 해준다.
//        // 피연산자를 더하거나 곱하거나 할떄는  int형이지만 나누기를 하면 double 형이 나오기 떄문에 아웃풋은 double 형으로 바꿈
//        // 처음엔 아웃풋을 모르니까 public void calculator 였지만 나누기를 생각하면서 아웃풋을 double 형으로 수정.
//        double answer = 0; // double형으로 answer을 0으로 선언 후 밑에서 가공.
//
//        if (operator.equals("+")) { // operator.equals("+") == operator의 종류가 +와 같으면 => 더하기 연산
//            // 더하기 연산
//            answer = firstNumber + secondNumber;
//            // answer = addOperation.operate(firstNumber, secondNumber); // 기존에는 직접 더했다면 step3를 하고나서는 이와 같은 방식으로 실행시켜주면 됨.
//
//        } else if (operator.equals("-")) {
//            // 빼기 연산
//            answer = firstNumber - secondNumber;
//        } else if (operator.equals("*")) {
//            // 곱하기 연산
//            answer = firstNumber * secondNumber;
//        } else if (operator.equals("/")) {
//            // 나누기 연산
//            answer = firstNumber / secondNumber;
//        }
//        // Step 2 > 2️⃣ 나머지 연산자(%)를 수행할 수 있게 Calculator 클래스 내부코드를 변경합니다.
//
//        else if (operator.equals("%")) {
//            answer = firstNumber % secondNumber;
//        }
//        return answer; //위 결과를 반환
//
//        // 이 Calculator 클래스가 정상적으로 작동이 되는지 Main 클래스를 만들어서 확인하기!
//
//        // Step 1 마무리
//
//
//
//
//    }
//}
//
//
//
//
//
//
//
//
//
//// Step 4
//
//
////4️⃣ AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스들을 AbstractOperation(추상 클래스)를 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경합니다.
////
////        - Step 3 와 비교해서 어떠한 점이 개선되었는지 스스로 생각해 봅니다.
////        - hint. 클래스 간의 결합도, 의존성(의존성 역전 원칙)
////- ❗️Calculator의 calculate 메서드의 매개변수가 변경되었습니다.
//
//
//
