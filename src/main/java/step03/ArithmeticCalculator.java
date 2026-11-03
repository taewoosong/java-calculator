package step03;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number>
{
    private ArrayList<Double> results = new ArrayList<>();

    public double calculate(T number1 ,T number2, OperatorType operator){

        double num1 = number1.doubleValue();
        double num2 = number2.doubleValue();
        double result = 0;

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
        results.add(result);
        return result;
    }

    public void removeResult()
    {
        if(!results.isEmpty()){
            results.remove(0);
        }
    }

    public ArrayList<Double> getResults() {
        return results;
    }

    public void setResults(ArrayList<Double> results)
    {
        this.results = results;
    }

    // 입력받은 기준값보다 큰 계산 결과만 조회
    public List<Double> getResults2(double value){
        return results.stream()
                .filter(result -> result > value)
                .toList();
    }
}

