import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner getInput = new Scanner(System.in);

    System.out.println("Enter first number");
    double firstNumber = Integer.parseInt(getInput.nextLine());
    System.out.println("Enter second number");
    double secondNumber = Integer.parseInt(getInput.nextLine());

    System.out.println("Add, Subtract, Multiply, or Divide?");
    String getArithmetic = getInput.nextLine();

    if (getArithmetic.equalsIgnoreCase("add")) {
      double add = (firstNumber + secondNumber);
      System.out.println(add);
    } else if (getArithmetic.equalsIgnoreCase("subtract")) {
      double subtract = (firstNumber - secondNumber);
      System.out.println(subtract);
    } else if (getArithmetic.equalsIgnoreCase("multiply")) {
      double multiply = (firstNumber * secondNumber);
      System.out.println(multiply);
    } else if (getArithmetic.equalsIgnoreCase("divide")) {
      double divide = (firstNumber / secondNumber);
      System.out.println(divide);
    } else {
      System.out.println("Invalid command");
    }
  }
}