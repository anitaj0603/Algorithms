import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Algorithms alg = new Algorithms("Numbers.txt");

        System.out.println("Odd numbers: " + alg.countOdds());
        System.out.println("Even numbers: " + alg.countEvens());
        System.out.println("Two-digit numbers: " + alg.countTwoDigitNumbers());
        System.out.println("Numbers greater than 500: " + alg.countGreaterThan500());
        System.out.println("Greatest number: " + alg.findGreatest());
        System.out.println("Least number: " + alg.findLeast());
        System.out.println("Sum of numbers: " + alg.calculateSum());
        System.out.println("Arithmetic mean: " + alg.calculateMean());
        System.out.println("Mode: " + alg.findMode());
    }
}
