package main.java.com.everton.averagecalculator;

import java.util.Scanner;

public class AverageCalculator {
  private double[] numbers;
  private double sum;
  private double average;

  public AverageCalculator(int size) {
      this.numbers = new double[size];
      this.sum = 0;
  }

  public void readNumbers() {
      Scanner scanner = new Scanner(System.in);
      for (int i = 0; i < numbers.length; i++) {
          System.out.print("Digite um número: ");
          numbers[i] = scanner.nextDouble();
          sum += numbers[i];
      }
  }

  public void calculateAverage() {
      average = sum / numbers.length;
  }

  public double getAverage() {
      return average;
  }
}
