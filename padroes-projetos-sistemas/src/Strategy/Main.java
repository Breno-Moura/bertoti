package Strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor para A");
        Float a = new Float(scanner.nextLine());
        System.out.println("Insira um valor para B");
        Float b = new Float(scanner.nextLine());
        Float result = calculator.calculator(a, b);
        scanner.close();
        System.out.println("Resultado: " + result);
        
    }
}
