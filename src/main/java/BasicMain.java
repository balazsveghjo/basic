import model.Alfa;
import utils.CelebNumbers;

import java.util.ArrayList;

public class BasicMain {

    public static void main(String[] args){

        Alfa beginAlfa  = new Alfa();

        CelebNumbers celebNumbers = new CelebNumbers();

        beginAlfa.setMessage("Hello!");
        System.out.println(beginAlfa.getMessage());

        final ArrayList<Integer> fibbosEach = celebNumbers.listOfFibonacciNumbers(20, 1000);
        final ArrayList<Integer> simplesEachForFibbos = celebNumbers.listOfNumbers(fibbosEach.size()-1);

        final ArrayList<Integer> primsEach = celebNumbers.listOfPrimNumbers(1000);
        final ArrayList<Integer> simplesEachForPrims = celebNumbers.listOfNumbers(primsEach.size()-1);

        /*
        beginAlfa.setMessage("\nSee numbers!");
        System.out.println(beginAlfa.getMessage());

        simplesEachForPrims.stream().filter(n -> n%1 == 0).forEach(System.out::println);

        beginAlfa.setMessage("\nSee every prim number!");
        System.out.println(beginAlfa.getMessage());

        primsEach.stream().filter(n -> n%1 ==0).forEach(System.out::println);

        beginAlfa.setMessage("\nSee every fibonacci number!");
        System.out.println(beginAlfa.getMessage());

        fibbosEach.stream().filter(n -> n%1 ==0).forEach(System.out::println);
        */

        beginAlfa.setMessage("\nSee every 2nd fibo number!");
        System.out.println(beginAlfa.getMessage());
        simplesEachForFibbos.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(fibbosEach.get(n)));

        beginAlfa.setMessage("\nSee every 2nd prime number!");
        System.out.println(beginAlfa.getMessage());
        simplesEachForPrims.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(primsEach.get(n)));

    }
}
