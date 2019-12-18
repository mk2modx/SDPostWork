import java.util.Scanner;

public class Calculator1 {



public static void main(String[] args) {


  Scanner kb = new Scanner(System.in);
  System.out.println("Welcome to Calculator.");
  System.out.println();
  System.out.println("Please enter first number : ");
  double firstNum = kb.nextDouble();
  System.out.println();
  System.out.println("Please enter second number : ");
  double secondNum = kb.nextDouble();
  System.out.println();
  System.out.println("Please enter an operator :  + , - , * , / : ");
  String operator = kb.next();
  System.out.println();
  System.out.println(" You entered : " + firstNum + " " + operator + " " + secondNum + " = ");

  System.out.println(operator);

  if (operator.equals("+")) {
    System.out.println("Your answer is : " + (firstNum + secondNum));
  }
  if (operator.equals("-")) {
    System.out.println("Your answer is : " + (firstNum - secondNum));
  }
  if (operator.equals("*")) {
    System.out.println("Your answer is : " + (firstNum * secondNum));
  }
  if (operator.equals("/")) {
    System.out.println("Your answer is : " + (firstNum / secondNum));
  }





}



}
