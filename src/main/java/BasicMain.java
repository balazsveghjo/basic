import model.Alfa;
import model.Bee;
import model.Ci;
import model.D;
import utils.CelebNumbers;

import java.util.ArrayList;
public class BasicMain {
    public static void main(String[] args){

        Alfa beginAlfa  = new Alfa();
        Bee beginBee  = new Bee();
        Ci beginCi  = new Ci();
        D beginD = new D();

        CelebNumbers celebNumbers = new CelebNumbers();

        beginAlfa.setMessage("Hello again 2!");

        System.out.println(beginAlfa.getMessage());

        final ArrayList<Integer> fibbosEach = celebNumbers.listOfFibonacciNumbers(20, 1000);
        final ArrayList<Integer> simplesEachForFibbos = celebNumbers.listOfNumbers(fibbosEach.size()-1);

        final ArrayList<Integer> primsEach = celebNumbers.listOfPrimNumbers(1000);
        final ArrayList<Integer> simplesEachForPrims = celebNumbers.listOfNumbers(primsEach.size()-1);

        //Alfa
        beginAlfa.setMessage("\nSee every 2nd fibo number!");
        System.out.println(beginAlfa.getMessage());
        simplesEachForFibbos.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(fibbosEach.get(n)));

        //Bee
        beginBee.setMessage("\nSee every 2nd prime number!");
        System.out.println(beginBee.getMessage());
        simplesEachForPrims.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(primsEach.get(n)));

        //Ci
        beginCi.setMessage("\n And now ...\n See every 3rd fibo number!");
        System.out.println(beginCi.getMessage());
        simplesEachForFibbos.stream().filter(n -> n%3 == 0).forEach(n -> System.out.println(fibbosEach.get(n)));

        beginCi.setMessage("\n And now ...\n See each fibo number below 1000!");
        System.out.println(beginCi.getMessage());
        simplesEachForFibbos.forEach(n -> System.out.println(fibbosEach.get(n)));

        //D
        beginD.setMessage("\n It is now easy and quick :) ");
        System.out.println(beginD.getMessage());

    }
}
