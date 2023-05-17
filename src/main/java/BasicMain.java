/**
 * This is the playground with celeb numbers ;)
 */

import model.*;
import utils.CelebNumbers;
import utils.Numbers;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicMain {
    public static void main(String[] args){
        char[] chars = {'h', 'i', '\n'};
        String showMessageShort = new String(chars);
        char[] charsAgain = showMessageShort.toCharArray();
        ArrayList<Integer> primNumbers = new ArrayList<>();
        ArrayList<Prim> prims = new ArrayList<>();

        for (char c : charsAgain){System.out.print(c);}

        boolean boolValue = true;
        String fromBoolean = Boolean.toString(boolValue);

        /**
         * long -> string
         */
        long longValue = 11_000_123;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        /**
         * long -> string
         * in one line
          */
        System.out.println(NumberFormat.getNumberInstance().format(11_000_124));

        /**
         * working with Classes
         * and with the String class
         */
        String showMessageMid = "Hi in this world!";
        String showMessageMidUpper = new String(showMessageMid.replace('w', 'W'));

        Alfa beginAlfa  = new Alfa();
        Bee beginBee  = new Bee();
        Ci beginCi  = new Ci();
        D beginD = new D();
        Prim prim = new Prim();

        int maxNumberOfNumbers = 10;
        int maxValueOfNumber = 200;
        int modPrim = 10;
        int modFibo = 2;

        Numbers simpleIntNumbers = new Numbers(maxNumberOfNumbers);
        System.out.println("\n" + new String(new char[8]).replace('\0', ' ')
                        +  simpleIntNumbers.getNumbers()
        );

        System.out.println(showMessageShort);

        simpleIntNumbers.getNumbers().forEach(n -> System.out.print((new String(new char[3-Double.valueOf(Math.log10(n)).intValue()]).replace('\0', ' ')) + String.format(" %d" ,simpleIntNumbers.getNumbers().get(n-1))));
        System.out.println();
        simpleIntNumbers.getNumbers().forEach(n -> System.out.println((new String(new char[3-Double.valueOf(Math.log10(n)).intValue()]).replace('\0', ' ')) + simpleIntNumbers.getNumbers().get(n-1) + (new String(new char[5*n-5]).replace('\0', ' ')) + "x"));

        CelebNumbers celebNumbers = new CelebNumbers();

        final ArrayList<Integer> fibbosEach = celebNumbers.listOfFibonacciNumbers(maxNumberOfNumbers, maxValueOfNumber);
        final ArrayList<Integer> simplesEachForFibbos = celebNumbers.listOfNumbers(fibbosEach.size()-1);

        final ArrayList<Integer> primsEach = celebNumbers.listOfPrimNumbers(maxValueOfNumber);
        final ArrayList<Integer> simplesEachForPrims = celebNumbers.listOfNumbers(primsEach.size()-1);

        //Alfa
        beginAlfa.setMessage("\n Hello again!\n\t" + showMessageMidUpper);
        System.out.println(beginAlfa.getMessage());

        //Bee
        beginBee.setMessage(String.format("\nSee every %d. prime number!", modPrim));
        System.out.println(beginBee.getMessage());
        simplesEachForPrims.stream()
                .filter(n -> n%modPrim == 0)
                .forEach(n -> System.out.println(n + ". -> " + primsEach.get(n-1)));

        beginBee.setMessage(String.format("\nSee every %d. prime number with parallelStream!", modPrim));
        System.out.println(beginBee.getMessage());
        simplesEachForPrims.parallelStream()
                .filter(n -> n%modPrim == 0)
                .forEach(n -> System.out.println(n + ". -> " + primsEach.get(n-1))
                );

        simplesEachForPrims.stream()
                .filter(n -> n%modPrim == 0)
                .forEach(n -> prims.add(new Prim(n, primsEach.get(n-1))));

        int total = prims.stream()
                .collect(Collectors.summingInt(Prim::getValue));
        System.out.println("The sum of these prims=" + total);

        /**
         * convert the elements of a Collection to String objects, then join them, separated by commas:
         */
        Stream<Integer> listOfPrims = primsEach.stream();
        String joined = listOfPrims.map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println("\n joined: " + joined);

        //Ci
        beginCi.setMessage(String.format("\n" +
                " And now ...\n" +
                " See every %d. fibo number!", modFibo));
        System.out.println(beginCi.getMessage());
        simplesEachForFibbos.stream()
                .filter(n -> n%modFibo == 0)
                .forEach(n -> System.out.println(n + ". -> " + fibbosEach.get(n)));

        beginCi.setMessage(String.format("\n" +
                " And now ...\n" +
                " Show maximum the first %d fibonacci numbers that are below %d!", maxNumberOfNumbers, maxValueOfNumber));
        System.out.println(beginCi.getMessage());
        simplesEachForFibbos
                .forEach(n -> System.out.println(n + ". -> " + fibbosEach.get(n)));

        //D
        beginD.setMessage("\n It is now easy and quick :) ");
        System.out.println(beginD.getMessage());
    }
}