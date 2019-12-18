import java.util.Scanner;

public class CalculatorCase{

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
    char operator = kb.next().charAt(0);
    System.out.println();
    System.out.println(" You entered : " + firstNum + " " + operator + " " + secondNum + " = ");


    kb.close();

    double output;

    switch(operator) {
      case '+':
        output = firstNum + secondNum;
        break;
      case '-':
        output = firstNum - secondNum;
        break;
      case '*':
        output = firstNum * secondNum;
        break;
      case '/':
        output = firstNum / secondNum;
        break;

      default:
        System.out.printf("You have entered the wrong operator");
        return;
    }

    System.out.println(firstNum + " " + operator + " " + secondNum + "  = " + output);

  }

}
