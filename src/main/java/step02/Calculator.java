package step02;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> results = new ArrayList<>();

    public double calculate(int number1, int number2 , char operator)
    {
        double result = 0;
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

    public void setResults(ArrayList<Double> results) {
        this.results = results;
    }
}
