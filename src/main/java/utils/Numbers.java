package utils;

import java.util.ArrayList;

public class Numbers {

    private ArrayList<Integer> numbers;

    public Numbers(int x){
        setNumbers(listOfNumbers(x));
    }
    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> getNumbers(){
        return this.numbers;
    }

    public ArrayList<Integer> listOfNumbers(int maxNumber) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int i;
        for (i = 1; i <= maxNumber; ++i) {
            numbers.add(i);
            if ( i > maxNumber ) break;
        }
        return numbers;
    }
}
