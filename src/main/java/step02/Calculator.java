package step02;

import java.util.ArrayList;

public class Calculator {
    // 계산 결과를 순서대로 저장하는 컬렉션
    private ArrayList<Double> results = new ArrayList<>();

    public double calculate(int number1, int number2 , char operator)
    {
        double result = 0;

        // 입력받은 숫자와 연산자로 사칙연산 수행
        switch (operator)
        {

            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = (double)number1 / number2;
                break;
            default:
                System.out.println("연산자를 잘못입력하셨습니다 다시입력하세요 .");
                return  0;
        }
        // 계산 결과를 리스트에 저장하고 App에 반환
        results.add(result);
        return result;
    }


    // 저장된 계산 결과가 있을 때 가장 오래된 값 삭제
    public void removeResult()
    {
        if(!results.isEmpty()){
            results.remove(0);
        }
    }
    // 저장된 계산 결과 목록을 외부에서 조회하기 위한 Getter
    public ArrayList<Double> getResults() {
        return results;
    }
    // 외부에서 전달받은 리스트로 기존 계산 결과 목록을 교체하는 Setter
    public void setResults(ArrayList<Double> results) {
        this.results = results;
    }
}
