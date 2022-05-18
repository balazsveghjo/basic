package utils;

import java.util.ArrayList;

public class CelebNumbers {

    public ArrayList<Integer> listOfNumbers(int maxNumber) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int i;
        for (i = 1; i <= maxNumber; ++i) {
            numbers.add(i);
            if ( i > maxNumber ) break;
        }
        return numbers;
    }

    public ArrayList<Integer> listOfPrimNumbers(int maxNumber) {
        ArrayList<Integer> primNumbers = new ArrayList<Integer>();

        for (int ix = 1; ix <= maxNumber; ++ix) {

            int i, m = 0, flag = 0;
            int n = ix;

            m = n / 2;
            if (n == 0 || n == 1) {
                //System.out.println(n+" is not prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    primNumbers.add(n);
                }
            }
        }
        return primNumbers;
    }

    public ArrayList<Integer> listOfFibonacciNumbers(int maxNumber, int maxValue) {
        ArrayList<Integer> fiboNumbers = new ArrayList<Integer>();
        int n1 = 0, n2 = 1, n3, i, count = maxNumber;

        fiboNumbers.add(n1);
        fiboNumbers.add(n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 > maxValue || i > maxNumber ) break;

            fiboNumbers.add(n3);
        }
        return fiboNumbers;
    }
}
