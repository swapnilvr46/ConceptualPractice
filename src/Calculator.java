import java.util.Scanner;

public class Calculator {
    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("which operation need to perform:  '+' ,'-' ,'*' ,'/' ");
        String operatationName = scanner.next();
        performOperation(operatationName, firstNumber, secondNumber);
    }

    void performOperation(String operatationName, int firstNumber, int secondNumber) {

        switch (operatationName) {
            case "+":
                System.out.println("Addition of Numbers: " + add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println("Subtration of Numbers: " + subtract(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println("Multiplication of Numbers: " + multiplication(firstNumber, secondNumber));
                break;
            case "/":
                if (secondNumber >= 1) {
                    System.out.println("Division of Numbers: " + division(firstNumber, secondNumber));
                    break;
                } else {
                    System.out.println("Division not divide by zero: ");
                }
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

    int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getInput();
    }
}
