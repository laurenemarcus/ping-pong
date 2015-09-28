import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number.");
    String firstStringNumber = myConsole.readLine();
    Float firstNumber = Float.parseFloat(firstStringNumber);

    System.out.println("Give me a second number.");
    String secondStringNumber = myConsole.readLine();
    Float secondNumber = Float.parseFloat(secondStringNumber);

    System.out.println("Enter Add, Subtract, Multiply, or Divide");
    String howToCalculate = myConsole.readLine();

    Float total = 0f;

    if ( howToCalculate.equals("Add") ) {
      total = firstNumber + secondNumber;
    } else if ( howToCalculate.equals("Subtract") ) {
      total = firstNumber - secondNumber;
    } else if ( howToCalculate.equals("Multiply") ) {
      total = firstNumber * secondNumber;
    } else if ( howToCalculate.equals("Divide") ) {
      total = firstNumber / secondNumber;
    } else {
      System.out.println("Invalid response.");
      System.exit(1);
    }

    String stringTotal = Float.toString(total);
    System.out.println("The total is " + stringTotal);
  }
}
