package anikputa.fibonacciGenerator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciGeneratorTests {

    @Test
    void shouldGenerateIndexNumbersOneToTen(){
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        //int[] s = {0,1,1,2,3,5,8,13};

        Assertions.assertArrayEquals(generatenumber1To100(),fibonacciGenerator.GenerateIndexNumbersOneToTen());


    }

    public int[] generatenumber1To100() {
        int[] numbers = new int[10];

        numbers[0]=0;
        numbers[1]=1;
        for(int i = 2; i < 10; i++){
            numbers[i] = numbers[i-2] + numbers[i-1];
        }
        return numbers;
    }

}

/* fibonacci index of 8

    0 1 1 2 3 5 8 13 21
    0 1 2 3 4 5 6 7 8

    if index of 8 is checked;

    do;
        0+1+1=2 is index of 2
        0+1+1=2 is index of 3
        1+2=3 is index of 4
        2+3=5 is index of 5
        3+5=8 is index of 6
        5+8=13 is index of 7



 */
