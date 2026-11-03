package step01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // 입력을 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // exit 입력하기 전까지 계산을 반복
        while(true)
        {

            // 첫 번째 정수와 두 번째 정수를 입력받음
            System.out.println("첫번쨰 수를 입력하세요 : ");
            int number1 = sc.nextInt();
            System.out.println("두번쨰 수를 입력하세요 : ");
            int number2 = sc.nextInt();

            // 음수 입력 여부를 검사하고 잘못된 입력이면 다시 시작
            if(number1 < 0 || number2 < 0)
            {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                continue;
            }

            //음수가 아닐 경우에만 연산자 입력
            System.out.println("연산자 (+ , - , * , /)을 입력하세요  : ");
            char operator = sc.next().charAt(0);

            //입력받은 연산자에 따라 사칙연산 수행
            switch (operator)
            {
                case '+':
                    System.out.println("값 : " + (number1 + number2));
                    break;
                case '-':
                    System.out.println("값 : " + (number1 - number2));
                    break;
                case '*':
                    System.out.println("값 : " + (number1 * number2));
                    break;
                case '/':
                    // 분모가 0이면 계산을 수행하지 않고 다시 입력받음
                    if(number2 == 0)
                    {
                        System.out.println("두번쨰 수에 0이 입력될수 없습니다 다시입력하세요");
                        continue;
                    }
                    else
                    {
                        System.out.println("값 : " + ((double)number1 / number2));
                        break;
                    }
                default:
                    System.out.println("잘못된 연산자를 입력하셨습니다 다시입력하세요 ");
                    continue;
            }
            System.out.println("종료하려면 exit을 입력하세요. (다시시작은 아무키나 누르면됩니다.)");
            String oper = sc.next();

            if(oper.equals("exit")){
                System.out.println("계산기를종료합니다.");
                break;
            }
        }
    }
}
