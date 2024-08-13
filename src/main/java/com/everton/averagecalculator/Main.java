package main.java.com.everton.averagecalculator;

public class Main {
    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator(50);

        calculator.readNumbers();
        calculator.calculateAverage();

        System.out.println("\nA média das 50 notas digitadas é: " + calculator.getAverage());
    }
}