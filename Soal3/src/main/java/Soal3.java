import java.util.Scanner;

class Operation{
    public static void main (String[] args){
        char operator;
        int A, B;
        Scanner input = new Scanner(System.in);
        int result;
        
         // ask users to enter operator
    System.out.println("Enter first number");
    A = input.nextInt();

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);
    
    System.out.println("Enter second number");
    B = input.nextInt();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = A + B;
        System.out.println(A + " + " + B + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = A - B;
        System.out.println(A + " - " + B + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = A * B;
        System.out.println(A + " * " + B + " = " + result);
        break;

      // performs division between numbers
      case '/':
        float C = A;
        float D = B;
        float result = C / D;
        System.out.println(A + " / " + B + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
} 
