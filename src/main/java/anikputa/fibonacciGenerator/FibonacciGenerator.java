package anikputa.fibonacciGenerator;

public class FibonacciGenerator {

    public int[] GenerateIndexNumbersOneToTen() {
            int[] numbers = new int[10];
            numbers[0]=0;
            numbers[1]=1;
            for(int i = 2; i < 10; i++){
                numbers[i] = numbers[i-2] + numbers[i-1];
            }
            return numbers;


    }
}
