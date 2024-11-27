package dogozat;

import java.util.Arrays;
import java.util.List;

public class Thecodes {
    public int dividersNumber(int number){
        int all=0;
        for (int i=1; i<= number; i++){
            if (number % i ==0){
                all +=1;
            }
        }
        return  all;
    }

    public  int maxOfThree(int number1,int number2,int number3){
        if (number1 >number2 && number1 >number3){
            return number1;
        }
        else if (number2> number1 && number2 >number3) {
            return  number2;
        }
        return  number3;
    }

    public  Object fizzBuzz(int number){
        if (number %3 ==0&& number%5==0){
            return  "FizzBuzz";
        }
        else if (number%5==0){
            return "Buzz";
        }
        if (number %3==0){
            return  "Fizz";
        }
        return number;
    }
    public boolean isVowel(char letter) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        return vowels.contains(letter);
    }
}
