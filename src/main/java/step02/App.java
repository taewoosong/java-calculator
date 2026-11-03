package step02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //입력을 위한 Scanner 및 Calculator 객체 생성
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // exit 입력 전까지 계산 반복
        while(true)
        {
            System.out.println("첫번쨰 수를 입력하세요 : ");
            double number1 = sc.nextDouble();
            System.out.println("두번쨰 수를 입력하세요 : ");
            double number2 = sc.nextDouble();

            //음수 검사
            if(number1 < 0 || number2 < 0)
            {
                System.out.println("0 이상의 숫자만 입력 가능합니다.");
                continue;
            }

            //음수가 아닐 경우에만 연산자 입력 및 연산자 검사.
            System.out.println("연산자 (+ , - , * , /)을 입력하세요  : ");
            char operator = sc.next().charAt(0);
            if(operator != '+' && operator != '-' &&
                    operator != '*' && operator != '/'){
                System.out.println("잘못입력하셨습니다. 다시입력하세요.");
                continue;
            }

            if(operator == '/' && number2 == 0){
                System.out.println("0으로 나눌수 없습니다 다시입력하세요.");
                continue;
            }

            // Calculator에 계산을 요청하고 반환된 결과를 출력
            double result = calculator.calculate(number1,number2,operator);
            System.out.println("값 : " + result);
            System.out.println("현재 저장된 값 : " + calculator.getResults());


            // yes 입력 시 가장 먼저 저장된 계산 결과 삭제
            System.out.println("삭제하려면 yes를 입력하세요. 계속진행하시려면 아무키나 누르세요. ");
            String oper1 = sc.next();
            if(oper1.equals("yes")){
                System.out.println("가장 오래된 값을 삭제합니다.");
                calculator.removeResult();
            }
            System.out.println("현재 저장된 값 : " + calculator.getResults());

            // 입력받은 기준값보다 큰 계산 결과만 조회하여 반환
            System.out.println("기준값보다 큰 결과를 조회하시겠습니까?(yes), 다시시작은 아무키나 누르세요.");
            String oper2 = sc.next();
            if(oper2.equals("yes")){
                System.out.println("기준값을 입력하세요 : ");
                double Standard = sc.nextDouble();

                System.out.println("기준보다 큰 값: " +
                        calculator.getResults2(Standard));
            }

            System.out.println("종료하려면 exit을 입력하세요. (다시시작은 아무키나 누르세요.)");
            String oper3 = sc.next();

            if(oper3.equals("exit")){
                System.out.println("계산기를종료합니다.");
                break;
            }
        }
    }
}
