package step01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("첫번쨰 수를 입력하세요 : ");
            int number1 = sc.nextInt();
            System.out.println("두번쨰 수를 입력하세요 : ");
            int number2 = sc.nextInt();

            //음수 검사
            if(number1 < 0 || number2 < 0)
            {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                continue;
            }

            //음수가 아닐 경우에만 연산자 입력
            System.out.println("연산자 (+ , - , * , /)을 입력하세요  : ");
            char operator = sc.next().charAt(0);

            //계산
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
