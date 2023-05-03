import model.Alfa;
import model.Bee;
import model.Ci;
import model.D;
import utils.CelebNumbers;
import utils.Numbers;

import java.util.ArrayList;
public class BasicMain {
    public static void main(String[] args){

        Alfa beginAlfa  = new Alfa();
        Bee beginBee  = new Bee();
        Ci beginCi  = new Ci();
        D beginD = new D();

        int maxNumberOfNumbers = 20;
        int maxValueOfNumber = 1000;
        int modPrim = 10;
        int modFibo = 2;

        //String spaces = new String(new char[n]).replace('\0', ' ');

        Numbers simpleIntNumbers = new Numbers(maxNumberOfNumbers);
        System.out.println(
                (
                        new String(new char[8]).replace('\0', ' ')
                )
                        +  simpleIntNumbers.getNumbers()
        );
        simpleIntNumbers.getNumbers().forEach(n -> System.out.print((new String(new char[3-Double.valueOf(Math.log10(n)).intValue()]).replace('\0', ' ')) + String.format(" %d" ,simpleIntNumbers.getNumbers().get(n-1))));
        System.out.println();
        simpleIntNumbers.getNumbers().forEach(n -> System.out.println((new String(new char[3-Double.valueOf(Math.log10(n)).intValue()]).replace('\0', ' ')) + simpleIntNumbers.getNumbers().get(n-1) + (new String(new char[5*n-5]).replace('\0', ' ')) + "x"));

        CelebNumbers celebNumbers = new CelebNumbers();

        final ArrayList<Integer> fibbosEach = celebNumbers.listOfFibonacciNumbers(maxNumberOfNumbers, maxValueOfNumber);
        final ArrayList<Integer> simplesEachForFibbos = celebNumbers.listOfNumbers(fibbosEach.size()-1);

        final ArrayList<Integer> primsEach = celebNumbers.listOfPrimNumbers(maxValueOfNumber);
        final ArrayList<Integer> simplesEachForPrims = celebNumbers.listOfNumbers(primsEach.size()-1);


        //Alfa
        beginAlfa.setMessage("\n Hello again!");
        System.out.println(beginAlfa.getMessage());

        //Bee
        beginBee.setMessage(String.format("\nSee every %d. prime number!", modPrim));
        System.out.println(beginBee.getMessage());
        simplesEachForPrims.stream().filter(n -> n%modPrim == 0).forEach(n -> System.out.println(primsEach.get(n)));

        //Ci
        beginCi.setMessage(String.format("\n" +
                " And now ...\n" +
                " See every %d. fibo number!", modFibo));
        System.out.println(beginCi.getMessage());
        simplesEachForFibbos.stream().filter(n -> n%modFibo == 0).forEach(n -> System.out.println(fibbosEach.get(n)));

        beginCi.setMessage(String.format("\n" +
                " And now ...\n" +
                " See each fibo number below %d!", maxValueOfNumber));
        System.out.println(beginCi.getMessage());
        simplesEachForFibbos.forEach(n -> System.out.println(fibbosEach.get(n)));

        //D
        beginD.setMessage("\n It is now easy and quick :) ");
        System.out.println(beginD.getMessage());

    }
}
