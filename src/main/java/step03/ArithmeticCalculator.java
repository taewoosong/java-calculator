package step03;

import java.util.ArrayList;
import java.util.List;

// Number를 상속한 숫자 타입만 사용할 수 있는 제네릭 계산기 클래스
public class ArithmeticCalculator<T extends Number>
{
    // 계산 결과를 순서대로 저장하는 컬렉션
    private ArrayList<Double> results = new ArrayList<>();

    // 제네릭 T 타입의 숫자 두 개와 Enum 연산자를 전달받아 계산
    public double calculate(T number1 ,T number2, OperatorType operator){

        double num1 = number1.doubleValue();
        double num2 = number2.doubleValue();
        double result = 0;

        // 입력받은 숫자와 연산자로 사칙연산 수행
        switch (operator){
            case PLUS:
                result = num1 + num2;
                break;
            case MINUS:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = num1 / num2;
                break;
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
    public void setResults(ArrayList<Double> results)
    {
        this.results = results;
    }

    // 입력받은 기준값보다 큰 계산 결과만 조회
    public List<Double> getResults2(double value){

        // stream() : 저장된 계산 결과를 스트림으로 처리
        // filter() : 람다식을 이용해 기준값보다 큰 결과만 선택
        // toList() : 선택된 결과를 새로운 리스트로 생성
        return results.stream()
                .filter(result -> result > value)
                .toList();
    }
}

